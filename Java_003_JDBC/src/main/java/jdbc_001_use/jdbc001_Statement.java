package jdbc_001_use;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc001_Statement {

    public static void main(String[] args) throws Exception {

    }
    /**
     * statement的使用：对于查询语句的使用
     */
    @Test
    public void test_statement() throws Exception {
        //  1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //  2.获取连接
        //  TODO：connection
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        //  3.创建
        // TODO: statement
        Statement statement = connection.createStatement();

        //  4.发送SQL语句
        String sql = "select id, account, password, nickname from t_user;";

        //  执行sql语句
        //  TODO: resultSet
        ResultSet resultSet = statement.executeQuery(sql);

        // 5.处理结果集
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String account = resultSet.getString("account");
            System.out.println("id = " + id + "account = " + account);
        }

        // 6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();

    }

    /**
     * statement对于DML的操作
     * TODO: 会产生，注入攻击的问题。
     *      当password == ' or '1' = '1的时候密码一定正确
     */
    @Test
    public void test_dynatic_statement() throws Exception{
        //1.输入账号和密码
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();
        String password = scanner.nextLine();
        scanner.close();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:mysql:///atguigu", "root", "root");
        Statement statement = connection.createStatement();

        // TODO : 这种拼接的形式会产生注入攻击的问题
        String sql = "select * from t_user where account ='"
                + account + "'and password = '" + password + "';";
        ResultSet i = statement.executeQuery(sql);
        if(i.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        i.close();
        statement.close();
        connection.close();
    }

}
