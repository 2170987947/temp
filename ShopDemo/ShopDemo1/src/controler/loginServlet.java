package controler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       // request.setCharacterEncoding("UTF-8");
        String name= request.getParameter("name");
        String password=request.getParameter("password");
        PrintWriter out=response.getWriter();

        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("password",password);

        if(password.equals("123")&&name.equals("fmm")) {
            response.sendRedirect("loginWelcome");
        } else if (name.isEmpty()) {
            out.println("账户名不能为空");
            response.setHeader("refresh","3;url=login.jsp");
        } else if (password.isEmpty()) {
            out.println("密码不能为空");
            response.setHeader("refresh","3;url=login.jsp");
        } else {
            out.println("密码错误");
            response.setHeader("refresh","3;url=login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
