package org.example.dao;

import org.example.exception.AppException;
import org.example.model.Article;
import org.example.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 21:07
 */
public class ArticleDAO {

    public static List<Article> query(int id) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Article> articles = new ArrayList<>();
        try {
            c = DBUtil.getConnection();
            String sql = "select * from article where user_id = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article article = new Article();
                article.setId(rs.getInt("id"));
                article.setTitle(rs.getString("title"));
                article.setContent(rs.getString("content"));
                if (rs.getDate("create_time") != null) {
                    article.setCreateTime(rs.getDate("create_time"));
                }
                article.setViewCount(rs.getInt("view_count"));
                article.setUserId(id);
                articles.add(article);
            }
            return articles;
        } catch (Exception e) {
            throw new AppException("ART001", "查询文章列表出错", e);
        } finally {
            DBUtil.close(c, ps, rs);
        }
    }

    public static void delete(String[] split) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = DBUtil.getConnection();
            String sql = "delete from article where id = ?";
            ps = c.prepareStatement(sql);
            for (int i = 0; i < split.length; i++) {
//                ps.setInt(Integer.parseInt(split[i]));
            }
        } catch (Exception e) {
            throw new AppException("ART003", "删除文章出错", e);
        } finally {
            DBUtil.close(c, ps, rs);
        }
    }

    public static int insert(Article a) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = DBUtil.getConnection();
            String sql = "insert into article(title, content, user_id) values (?, ?, ?);";
            ps = c.prepareStatement(sql);
            ps.setString(1, a.getTitle());
            ps.setString(2, a.getContent());
            ps.setInt(3, a.getUserId());
            return ps.executeUpdate();
        } catch (Exception e) {
            throw new AppException("ART002", "新增文章出错", e);
        } finally {
            DBUtil.close(c, ps);
        }
    }

    public static Article queryById(int parseInt) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = DBUtil.getConnection();
            String sql = "select * from article where id = ?;";
            ps = c.prepareStatement(sql);
            ps.setInt(1, parseInt);
            Article article = null;
            rs = ps.executeQuery();
            while (rs.next()) {
                article = new Article();
                article.setId(parseInt);
                article.setTitle(rs.getString("title"));
                article.setContent(rs.getString("content"));
                if (rs.getDate("create_time") != null) {
                    article.setCreateTime(rs.getDate("create_time"));
                }
                article.setViewCount(rs.getInt("view_count"));
                article.setUserId(rs.getInt("user_id"));
            }
            return article;
        } catch (Exception e) {
            throw new AppException("ART004", "查询文章详情出错", e);
        } finally {
            DBUtil.close(c, ps, rs);
        }
    }

    public static int update(Article article) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = DBUtil.getConnection();
            String sql = "update article set title= ?, content = ? where id = ? ";
            ps = c.prepareStatement(sql);
            ps.setString(1, article.getTitle());
            ps.setString(2, article.getContent());
            ps.setInt(3, article.getId());
            return ps.executeUpdate();
        } catch (Exception e) {
            throw new AppException("ART005", "更新文章出错", e);
        } finally {
            DBUtil.close(c, ps);
        }
    }
}
