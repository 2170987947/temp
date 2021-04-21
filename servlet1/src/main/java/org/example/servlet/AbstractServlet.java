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
 * @date 2021/4/1 20:11
 */
@WebServlet("/ss")
public class AbstractServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        System.out.println("打印");
        System.out.println(req.getServerName());
        pw.println(req.getScheme() + "\n");
        pw.println(req.getLocalPort() + "\n");
//        pw.println(req.getRequestURI());
//        pw.println(req.getServletPath());
//        pw.println(req.getContextPath());
//        pw.println(req.getRemotePort());
//        pw.println(req.getMethod());
//        pw.println(req.getPart("ff"));
//        pw.println(req.getCookies());
//        pw.println(req.getRequestURL());
//        System.out.println(resp.getStatus());
//        System.out.println(resp.getClass());
//        System.out.println(resp.getOutputStream());
        pw.flush();
        pw.close();
    }
}
