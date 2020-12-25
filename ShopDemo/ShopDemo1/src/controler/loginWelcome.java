package controler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginWelcome")
public class loginWelcome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        String name = session.getAttribute(name);


        if(password.equals("123")&&name.equals("fmm")) {
            response.sendRedirect("login.jsp");
        }

       // request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("欢迎登陆");
    }
}
