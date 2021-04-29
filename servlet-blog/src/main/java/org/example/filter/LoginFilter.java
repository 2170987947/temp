package org.example.filter;

import org.example.exception.AppException;
import org.example.model.JSONResponse;
import org.example.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/29 20:53
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String servletPath = req.getServletPath();
        boolean islogin = isLogin(req);
        if (servletPath.startsWith("/jsp/")) {
            if (!islogin) {
                String scheme = req.getScheme();
                String host = req.getServerName();
                int port = req.getServerPort();
                String contextPath = req.getContextPath();
                String basePath = scheme + "://" + host + ":" + port +"/" + contextPath;
                resp.sendRedirect(basePath + "/login.html");
                return;
            }
        } else if (!(servletPath.startsWith("/static/") || servletPath.equals("/login.html") ||
                servletPath.equals("/login"))) {
            if (!islogin) {
                resp.setStatus(401);
                JSONResponse json = new JSONResponse();
                json.setCode("LOG000");
                json.setMessage("用户未登录， 没有权限");
//                throw new AppException("LOG000", "用户未登录， 没有权限");
            }
        }
        filterChain.doFilter(req, resp);

    }

    private static boolean isLogin(HttpServletRequest req) {
        HttpSession session = req.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("user");
            if (user != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void destroy() {

    }
}
