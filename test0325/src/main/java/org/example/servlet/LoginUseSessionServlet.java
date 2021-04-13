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
 * @date 2021/3/26 1:22
 */
@WebServlet("/loginUseSession")
public class LoginUseSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求体编码
        req.setCharacterEncoding("UTF-8");
        // 设置响应体编码
        resp.setContentType("UTF-8");
        // 设置响应数据类型
        resp.setContentType("text/html;charset = UTF-8");
        // 解析数据
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        System.out.printf("================用户名（%s)密码（%s)", u, p);
        // 返回响应数据
        PrintWriter printWriter = resp.getWriter();
        // 模拟数据库账号密码登录
        if ("abc".equals(u) && "123".equals(p)) {
            // 获取 session 信息（从客户端获取 jsionid），参数为 false：如果获取不到，返回 null
            // 参数为 true ，如果获取不到，创建一个（服务端创建），再返回。
            HttpSession session = req.getSession();
            session.setAttribute("username", u);
            session.setAttribute("password", p);
            printWriter.println("登陆成功");
            printWriter.println("<h3>欢迎" + u + "</h3>");
        } else {
            printWriter.println("登陆失败");
            printWriter.println("<h3>用户名：" + u + "密码错误</h3>");
            // 有缓冲的 IO 操作，需要刷新缓冲区，才能真正地发送数据
            printWriter.flush();
            // IO 流操作完，一定要记住关闭资源
            printWriter.close();
        }
    }
}
