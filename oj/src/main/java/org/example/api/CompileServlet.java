package org.example.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.compile.Answer;
import org.example.compile.Question;
import org.example.compile.Task;
import org.example.problem.Problem;
import org.example.problem.ProblemDAO;
import org.example.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/compile")
public class CompileServlet extends HttpServlet {
    private Gson gson = new GsonBuilder().create();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String string = HttpUtil.readBody(req);

        CompileRequest compileRequest = gson.fromJson(string, CompileRequest.class);

        ProblemDAO problemDAO = new ProblemDAO();
        Problem problem = problemDAO.selectOne(compileRequest.getId());
        if (problem == null) {
            resp.setStatus(200);
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write("{\" code\":找不到代码}");
        }
        String testCode = problem.getTestCode();
        String requestCode = compileRequest.getCode();
        String finalCode = mergeCode(testCode, requestCode);

        Question question = new Question();
        question.setCode(finalCode);
        Task task = new Task();
        Answer answer = null;
        try {
            answer = task.compileAndRun(question);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CompileResponse compileResponse = new CompileResponse();
        compileResponse.setErrno(answer.getErrno());
        compileResponse.setReason(answer.getReason());
        compileResponse.setStdout(answer.getStdout());

        resp.setStatus(200);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(gson.toJson(compileResponse));
    }

    private String mergeCode(String testCode, String requestCode) {
        int pos = requestCode.lastIndexOf("}");
        if (pos == -1) {
            return null;
        }
        return requestCode.substring(0, pos) + testCode + "}";
    }
}
