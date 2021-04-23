package org.example.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/22 19:19
 */
@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        InputStream is = req.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        User input = mapper.readValue(is, User.class);

        PrintWriter pw = resp.getWriter();
        Map<String, Object> map = new HashMap<>();
        if ("abc".equals(input.getUsername()) && "123".equals(input.getPassword())) {
            map.put("ok", true);
            map.put("message", input);
        } else {
            map.put("ok", false);
            map.put("code", "LOG001");
            map.put("msg", "用户名或密码错误");
        }

        pw.println(mapper.writeValueAsString(map));
    }
}
