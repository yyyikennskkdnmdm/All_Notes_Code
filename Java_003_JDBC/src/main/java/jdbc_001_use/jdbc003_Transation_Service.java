package jdbc_001_use;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * service层编写了具体的操作行为，编写事务，以及connection的创建、使用、关闭。
 */
public class jdbc003_Transation_Service {

    public void transfer(String addAccount, String subAccount, int money) throws ClassNotFoundException, SQLException {
        System.out.println("addAccount = " + addAccount + ", subAccount = " + subAccount + ", money = " + money);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "root");
        int flag = 0;
        try{
            connection.setAutoCommit(false);
            jdbc003_Transation_Dao bankDao = new jdbc003_Transation_Dao();
            bankDao.addMoney(addAccount,money,connection);
            bankDao.subMoney(subAccount,money,connection);
            flag = 1;
            connection.commit();
        }catch (Exception e){
            connection.rollback();
            throw e;
        }finally {
            connection.close();
        }

        if (flag == 1){
            System.out.println("转账成功!");
        }else{
            System.out.println("转账失败!");
        }
    }


}
