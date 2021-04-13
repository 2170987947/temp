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
 * @date 2021/3/26 0:55
 */
@WebServlet("/sen")
public class SensitiveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求体编码
        req.setCharacterEncoding("UTF-8");
        // 设置响应体编码
        resp.setContentType("UTF-8");
        // 设置响应体数据类型
        resp.setContentType("text/html;charset = UTF-8");
        // 返回响应数据
        PrintWriter printWriter = resp.getWriter();
        // 获取 session, 如果没有不创建
        HttpSession session = req.getSession(false);
        // 每一个敏感资源, 都获取 session, 通过是否为空验证用户是否登陆: 代码耦合性太高
        // 可以使用 Filter 过滤器, 统一处理敏感资源验证.
        if (session == null) {
            System.out.println("Session为空");
            // 请求身份验证: 没有登录, 访问敏感资源, 返回 401, 表示 Unauthorized
            resp.setStatus(401);
            printWriter.println("敏感资源, 需要登录后访问");
        } else {
            String username = (String) session.getAttribute("username");
            System.out.println("session存在, 用户名: " + username);

            // 登录没有权限, 返回 403.
        }
        printWriter.flush();
        printWriter.close();
    }
}
