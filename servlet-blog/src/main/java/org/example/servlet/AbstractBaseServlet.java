package org.example.servlet;

import org.example.exception.AppException;
import org.example.model.JSONResponse;
import org.example.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 19:33
 */
public abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("appliction/json");
        // 1. 解析请求数据
        JSONResponse json = new JSONResponse();
        // 2. 处理业务
        try {
            Object data = process(req, resp);
            json.setSuccess(true);
            json.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
            String code = "UNKOWN";
            String s = "未知错误";
            if (e instanceof AppException) {
                code = ((AppException) e).getCode();
                s = e.getMessage();
            }
            json.setMessage(s);
            json.setCode(code);
        }
        // 3. 返回响应内容 (json)
        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.serialize(json));
        pw.flush();
        pw.close();
    }

    protected abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException;

}
