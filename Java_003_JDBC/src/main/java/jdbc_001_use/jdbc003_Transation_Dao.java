package jdbc_001_use;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * dao层：设置了所需要进行的操作，preparedStatement的创建、操作、关闭
 */
public class jdbc003_Transation_Dao {


    public void addMoney(String account, double money, Connection connection) throws SQLException {
        String sql = "update t_bank set money = money + ? where account = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, money);
        preparedStatement.setString(2, account);
        int rows = preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void subMoney(String account, double money, Connection connection) throws SQLException {
        String sql = "update t_bank set money = money - ? where account = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, money);
        preparedStatement.setString(2, account);
        int rows = preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}