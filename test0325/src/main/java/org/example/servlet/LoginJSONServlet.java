package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PrintWriter;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/3/25 2:43
 */
// 注解使用： 属性名 = 属性名
@WebServlet("/loginJSON")
public class LoginJSONServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求体编码
        req.setCharacterEncoding("UTF-8");
        // 设置响应体编码
        resp.setContentType("UTF-8");
        // 设置响应数据格式
        resp.setContentType("application/json;charset = UTF-8");

        // 解析数据
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        System.out.printf("================用户名（%s)密码（%s)", u, p);

        // 返回响应数据
        PrintWriter printWriter = resp.getWriter();
        if ("abc".equals(u) && "123".equals(p)) {
            printWriter.println("{\"success\": true}");
        } else {
            printWriter.println("{\"success\": false}");
        }
        printWriter.flush();
        printWriter.close();
    }

}
