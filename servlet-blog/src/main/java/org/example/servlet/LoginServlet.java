package org.example.servlet;

import org.example.dao.UserDAO;
import org.example.exception.AppException;
import org.example.model.User;
import org.example.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 19:32
 */
@WebServlet("/login")
public class LoginServlet extends AbstractBaseServlet {

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
        User input = JSONUtil.deserialize(req.getInputStream(), User.class);
        User query = UserDAO.query(input.getUsername());
        if (query == null) {
            throw new AppException("LOG002", "用户不存在");
        }
        if (!query.getPassword().equals(input.getPassword())) {
            throw new AppException("LOG003", "用户名或密码错误");
        }
        HttpSession session = req.getSession();
        session.setAttribute("user", query);

        return null;
    }
}
