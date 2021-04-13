import java.sql.*;

public class A {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql: /localhost: 3306/blogdemo", "root", "123456");
        Statement statement = connection.createStatement();
        System.out.println(connection);
    }
}
