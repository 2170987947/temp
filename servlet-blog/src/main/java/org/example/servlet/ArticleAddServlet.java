package org.example.servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;
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
 * @date 2021/4/27 20:55
 */
@WebServlet("/articleAdd")
public class ArticleAddServlet extends AbstractBaseServlet {
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Article a = JSONUtil.deserialize(req.getInputStream(), Article.class);
        HttpSession session = req.getSession(false);
        User user = (User) session.getAttribute("user");
        a.setUserId(user.getId());
        int num = ArticleDAO.insert(a);
        return null;
    }
}
