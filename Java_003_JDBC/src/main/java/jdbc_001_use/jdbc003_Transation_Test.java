package jdbc_001_use;

import java.sql.SQLException;

/**
 * 关于如何设置事务的测试
 */
public class jdbc003_Transation_Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        jdbc003_Transation_Service service = new jdbc003_Transation_Service();
        service.transfer("ergouzi", "lvdandan",
                1500);
    }
}
