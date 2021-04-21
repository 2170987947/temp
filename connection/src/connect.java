
    import java.sql.*;

    public class connect {
        public static void main(String[] args) {
            Connection con = null;
            Statement sta = null;
            ResultSet rs = null;

            try {
                // 加载驱动类
                Class.forName("com.mysql.jdbc.Driver");
                long start = System.currentTimeMillis();

                // 建立连接
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cart",
                        "root", "123456");
                long end = System.currentTimeMillis();
                System.out.println(con);
                System.out.println("建立连接耗时： " + (end - start) + "ms 毫秒");

                // 创建Statement对象
                sta = con.createStatement();

                // 执行SQL语句
                rs = sta.executeQuery("select * from heima");
                System.out.println("id\tname\tage\tsex");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2)
                            + "\t" + rs.getInt(3) + "\t" + rs.getInt(4));
                }


            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    if (sta != null) {
                        sta.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
