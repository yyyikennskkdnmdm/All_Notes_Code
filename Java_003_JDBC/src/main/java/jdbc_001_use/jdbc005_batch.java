package jdbc_001_use;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 批量插入并优化代码执行时间，使用batch插入
 */
public class jdbc005_batch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu?rewriteBatchedStatements=true", "root", "root");
        String sql = "insert into t_user(account,password,nickname) values(?,?,?)";

        // 计时
        long start = System.currentTimeMillis();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for(int i = 0 ;i < 100;i++){
            preparedStatement.setObject(1, "ergouzi"+i);
            preparedStatement.setObject(2,"lvdandan");
            preparedStatement.setObject(3,"驴蛋蛋"+i);
            // TODO 单个加入
//            statement.executeUpdate();
            // TODO batch加入
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();

        long end = System.currentTimeMillis();
        System.out.println("消耗时间："+(end - start));

        connection.close();
    }
}
