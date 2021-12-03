package org.example.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.problem.Problem;
import org.example.problem.ProblemDAO;
import org.example.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/problem")
public class ProblemServlet extends HttpServlet {
    // 读取题目列表和读取指定题目
    private Gson gson = new GsonBuilder().create();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setContentType("application/json; charset=utf-8");
        String id = req.getParameter("id");
        if (id == null || id.equals("")) {
            selectAll(resp);
        } else {
            selectOne(Integer.parseInt(id), resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = HttpUtil.readBody(req);
        Problem problem = gson.fromJson(body, Problem.class);
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.insert(problem);
        resp.setStatus(200);
        resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().write("{\"ok\": 1}");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setStatus(200);
        resp.setContentType("application/json; charset=utf-8");
        if (id == null || id.equals("")) {
            resp.getWriter().write("{\"ok\": 0, \"reason\": \"id 不存在\"}");
            return;
        }
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.delete(Integer.parseInt(id));
        resp.getWriter().write("{\"ok\": 1}");
    }



    private void selectOne(int parseInt, HttpServletResponse resp) throws IOException {
        ProblemDAO problemDAO = new ProblemDAO();
        Problem problem = problemDAO.selectOne(parseInt);
        String responseString = gson.toJson(problem);
        resp.getWriter().write(responseString);
    }

    private void selectAll(HttpServletResponse resp) throws IOException {
        ProblemDAO problemDAO = new ProblemDAO();
        List<Problem> list = problemDAO.selectAll();
        String responseString = gson.toJson(list);
        resp.getWriter().write(responseString);
    }
}
