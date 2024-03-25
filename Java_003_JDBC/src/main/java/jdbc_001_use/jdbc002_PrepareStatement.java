package jdbc_001_use;

import org.testng.annotations.Test;

import java.sql.*;
import java.util.*;

/**
 * TODO : preparestatement可以避免注入攻击的问题
 * 本篇内容为使用preparestatement进行的crud操作
 *
 */
public class jdbc002_PrepareStatement {
    public static void main(String[] args) throws Exception{

        //1.输入账号和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入账号");
        String account = scanner.nextLine();
        System.out.print("输入密码");
        String password = scanner.nextLine();
        scanner.close();

        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        //4.创建prepareStatement
        String sql = "select * from t_user where account = ? and password = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.获取占位符
        preparedStatement.setObject(1,account);
        preparedStatement.setObject(2, password);

        //6. 执行sql语句，这哥们会在内部完成sql语句的拼接
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        //7.关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void test_PrepareStatement() throws Exception {

        //1.输入账号和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入账号");
        String account = scanner.nextLine();
        System.out.print("输入密码");
        String password = scanner.nextLine();
        scanner.close();

        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //3.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        //4.创建prepareStatement
        String sql = "select * from t_user where account = ? and password = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.获取占位符
        preparedStatement.setObject(1,account);
        preparedStatement.setObject(2, password);

        //6. 执行sql语句，这哥们会在内部完成sql语句的拼接
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        //7.关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    /**
     * 插入数据
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void testInsert() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        String sql = "insert into t_user(account,password,nickname) values(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1,"shenyige");
        preparedStatement.setObject(2,"123456");
        preparedStatement.setObject(3, "zhengzhirong");

        // TODO : 返回值为插入了几行数据
        int i = preparedStatement.executeUpdate();

        System.out.println(i);

        preparedStatement.close();
        connection.close();

    }
    /**
     * 删除输入据
     */
    @Test
    public void test_delete() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        String sql = "delete from t_user where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, 10003);

        int i = preparedStatement.executeUpdate();
        System.out.println(i);

        preparedStatement.close();
        connection.close();
    }


    @Test
    public void test_QueryMap() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        String sql = "select * from t_user;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Map> mapList = new ArrayList<>();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while(resultSet.next()){
            Map map = new HashMap();
            for (int i=1; i<=columnCount; i++){
                map.put(metaData.getColumnLabel(i), resultSet.getObject(i));
            }
            mapList.add(map);
        }
        System.out.println(mapList);
        //关闭资源close
        preparedStatement.close();
        connection.close();
        resultSet.close();
    }


    /**
     * 批量删除
     */
    @Test
    public void test_delete_xtoy() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");

        String sql = "delete from t_user where id = ?;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        for(int i = 10006; i <= 12395 ;i++){
            preparedStatement.setObject(1, i);
            preparedStatement.executeUpdate();
        }
        preparedStatement.close();
        connection.close();


    }
}
