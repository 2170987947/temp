package org.example.problem;

import org.example.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProblemDAO {

    public void insert(Problem problem) {
        Connection connection = DBUtil.getConnection();
        String sql = "insert into oj_table values (null, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, problem.getTitle());
            statement.setString(2, problem.getLevel());
            statement.setString(3, problem.getDescription());
            statement.setString(4, problem.getTemplateCode());
            statement.setString(5, problem.getTestCode());
            // 3. 执行 SQL 语句
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭释放相关资源.
            DBUtil.close(connection, statement, null);
        }
    }

    public void delete(int problemId) {
        Connection connection = DBUtil.getConnection();
        String sql = "delete from oj_table where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, problemId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(connection, preparedStatement, null);
        }
    }


    public List<Problem> selectAll() {
        Connection connection = DBUtil.getConnection();
        String sql = "select * from oj_table";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Problem> list = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            list = new ArrayList<>();
            while (resultSet.next()) {
                Problem problem = new Problem();
                problem.setId(resultSet.getInt("id"));
                problem.setTitle(resultSet.getString("title"));
                problem.setLevel(resultSet.getString("level"));
                problem.setDescription(resultSet.getString("description"));
                problem.setTemplateCode(resultSet.getString("templateCode"));
                problem.setTestCode(resultSet.getString("testCode"));
                list.add(problem);
            }
            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(connection, preparedStatement, resultSet);
        }
        return null;
    }

    public Problem selectOne(int problemId) {
        Connection connection = DBUtil.getConnection();
        String sql = "select * from oj_table where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Problem problem = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, problemId);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                problem = new Problem();
                problem.setId(resultSet.getInt("id"));
                problem.setTitle(resultSet.getString("title"));
                problem.setLevel(resultSet.getString("level"));
                problem.setDescription(resultSet.getString("description"));
                problem.setTemplateCode(resultSet.getString("templateCode"));
                problem.setTestCode(resultSet.getString("testCode"));
            }
            return problem;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(connection, preparedStatement, resultSet);
        }
        return problem;
    }

    public static void main(String[] args) {
        testInsert();
//        testDelete(3);
//        testSelectOne(3);
        testSelectAll();
    }

    private static void testSelectAll() {
        ProblemDAO problemDAO = new ProblemDAO();
        System.out.println(problemDAO.selectAll());
    }

    private static void testSelectOne(int problemId) {
        ProblemDAO problemDAO = new ProblemDAO();
        System.out.println(problemDAO.selectOne(problemId));
    }

    private static void testDelete(int problemId) {
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.delete(problemId);
    }

    private static void testInsert() {
        Problem problem = new Problem();
        problem.setTitle("各位相加");
        problem.setLevel("简单");
        problem.setDescription("给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。\n" +
                "\n" +
                "示例:\n" +
                "\n" +
                "输入: 38\n" +
                "输出: 2 \n" +
                "解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。\n" +
                "\n" +
                "来源：力扣（LeetCode）\n" +
                "链接：https://leetcode-cn.com/problems/add-digits\n" +
                "著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。");
        problem.setTemplateCode("public class Solution {\n" +
                "    public int addDigits(int num) {\n" +
                "\n" +
                "    }\n" +
                "}");
        problem.setTestCode(
                "    public static void main(String[] args) {\n" +
                        "        Solution s = new Solution();\n" +
                        "        if (s.addDigits(38) == 2) {\n" +
                        "            System.out.println(\"test OK\");\n" +
                        "        } else {\n" +
                        "            System.out.println(\"test failed\");\n" +
                        "        }\n" +
                        "\n" +
                        "        if (s.addDigits(1) == 1) {\n" +
                        "            System.out.println(\"test OK\");\n" +
                        "        } else {\n" +
                        "            System.out.println(\"test failed\");\n" +
                        "        }\n" +
                        "    }\n");
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.insert(problem);
    }
}
