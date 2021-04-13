package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/3/25 2:43
 */
// 注解使用： 属性名 = 属性名
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        System.out.printf("================用户名（%s)密码（%s)", u, p);
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("登陆成功");
        printWriter.println("<h3>欢迎你，" + u + "</h3>");
        printWriter.flush();
        printWriter.close();
    }

}
