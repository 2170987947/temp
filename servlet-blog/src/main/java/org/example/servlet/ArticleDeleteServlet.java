package org.example.servlet;

import org.example.dao.ArticleDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/27 20:40
 */
@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends AbstractBaseServlet {

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String ids = req.getParameter("ids");
        ArticleDAO.delete(ids.split(","));
        return null;
    }
}
