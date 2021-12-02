package org.example.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/oj?characterEncoding=utf8&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    private static volatile DataSource dataSource = null;

    private DBUtil(){}

    public static DataSource getDataSource() {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {
                    dataSource = new MysqlDataSource();
                    ((MysqlDataSource)dataSource).setURL(URL);
                    ((MysqlDataSource)dataSource).setUser(USERNAME);
                    ((MysqlDataSource)dataSource).setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }

    public static Connection getConnection() {
        try {
            // 内置了数据库连接池.
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


//    public static DataSource getDataSource() {
//        if (dataSource == null) {
//            synchronized (DBUtil.class) {
//                if (dataSource == null) {
//                    dataSource = new MysqlDataSource();
//                    ((MysqlDataSource)dataSource).setURL(URL);
//                    ((MysqlDataSource)dataSource).setUser(USERNAEM);
//                    ((MysqlDataSource)dataSource).setPassword(PASSWORD);
//                }
//            }
//        }
//        return dataSource;
//    }
//
//    public static Connection getConnection() {
//        try {
//            return getDataSource().getConnection();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
//    }

    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(DBUtil.getDataSource());
        System.out.println(DBUtil.getConnection());
    }
}
