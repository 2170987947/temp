package org.example.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.example.exception.AppException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/25 20:19
 */
public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/blogdemo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static final DataSource DS =new MysqlDataSource();

    static {
        ((MysqlDataSource) DS).setURL(URL);
    }
    public static Connection getConnection() {
        try {
            return DS.getConnection();
        } catch (SQLException e) {
            throw new AppException("DB001", "数据库连接失败", e);
        }
    }

    public static void main(String[] args) {
        System.out.println(DBUtil.getConnection());
    }
    public static void close(Connection c, Statement s) {
        close(c, s, null);
    }
    public static void close(Connection c, Statement s, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (s != null) {
                s.close();
            }
            if (c != null) {
                c.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
