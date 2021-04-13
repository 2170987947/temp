package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/3/25 0:35
 */
public class JDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "123456");
        System.out.println(connection);
    }
}
