package org.example.dao;

import org.example.exception.AppException;
import org.example.model.User;
import org.example.util.DBUtil;

import java.sql.*;
import java.util.Date;


/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 20:52
 */
public class UserDAO {

    public static User query(String username) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c = DBUtil.getConnection();
            String sql = "select * from user where username = ?";
            ps = c.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            User user = null;
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNickname(rs.getString("nickname"));
                user.setSex(rs.getBoolean("sex"));
//                Timestamp t = rs.getTimestamp("birthday");
//                if (t != null) {
//                    user.setBirthday(new Date(t.getTime()));
//                }
                if (rs.getDate("birthday") != null) {
                    user.setBirthday(rs.getDate("birthday"));
                }
                user.setHead(rs.getString("head"));
            }
            return user;
        } catch (SQLException e) {
            throw new AppException("LOG001", "查询用户操作出错", e);
        } finally {
            DBUtil.close(c, ps, rs);
        }
    }
}
