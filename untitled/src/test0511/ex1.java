package test0511;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/5/11 22:11
 */
public class ex1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("localhost:8080/test", "root", "123456");
        System.out.println(c);
    }
}
