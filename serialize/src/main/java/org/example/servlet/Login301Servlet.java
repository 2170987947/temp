package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/3/25 2:43
 */
// 注解使用： 属性名 = 属性名
@WebServlet("/login301")
public class Login301Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        System.out.printf("================用户名（%s)密码（%s)", u, p);
        PrintWriter printWriter = resp.getWriter();
        if ("abc".equals(u) && "123".equals(p)) {
            // 重定向: http 响应状态码设置 301 / 302 / 307, 响应头 location
            // 两次王阔请求
            resp.sendRedirect("home.html");
        } else if ("abc".equals(u)) {
            // 转发: 一次网络请求, 转发一次
            req.getRequestDispatcher("home.html").forward(req, resp);
        } else {
            printWriter.println("登陆失败");
            printWriter.println("<h3>用户名：" + u + "密码错误</h3>");
            printWriter.flush();
            printWriter.close();
        }
    }

}
