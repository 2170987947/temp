package servlet;

import bean.Order;
import bean.OrderItem;
import bean.User;
import dao.OrderDAO;
import dao.OrderItemDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OrderCreateServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        User u = (User) request.getSession().getAttribute("user");
        if(null==u){
            response.sendRedirect("/login.jsp");
            return;
        }


        Order o = new Order();
        o.setUser(u);

        new OrderDAO().insert(o);

        List<OrderItem> ois = (List<OrderItem>) request.getSession().getAttribute("ois");
        for (OrderItem oi : ois) {
            oi.setOrder(o);
            new OrderItemDAO().insert(oi);
        }

        ois.clear();

        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("订单创建成功");
        pw.println("<a href='login'>返回购物</a>");

    }
}