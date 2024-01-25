package jdbc_001_use;

import java.sql.*;

/**
 * TODO ： 主键回显
 */
public class jdbc004_returnPrimaryKey {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu?user=root&password=root");
        String sql = "insert into t_user(account,password,nickname) value(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setObject(1, "towgog");
        preparedStatement.setObject(2, "123456");
        preparedStatement.setObject(3, "二狗子");
        int i = preparedStatement.executeUpdate();

        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        generatedKeys.next();
        int anInt = generatedKeys.getInt(1);
        System.out.println("anInt = " + anInt);

        preparedStatement.close();
        connection.close();

    }
}
