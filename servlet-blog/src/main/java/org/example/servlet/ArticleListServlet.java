package org.example.servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/27 19:48
 */
@WebServlet("/articleList")
public class ArticleListServlet extends AbstractBaseServlet {

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        User query = (User) session.getAttribute("user");
        List<Article> articles = ArticleDAO.query(query.getId());
        return articles;
    }
}
