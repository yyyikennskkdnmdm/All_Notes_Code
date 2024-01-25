package function001;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojo.SysUser;
import util.BaseDao;

import java.util.ArrayList;
import java.util.List;

public class BaseDaoTest {

    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao(){
        baseDao = new BaseDao();
    }

    @Test
    public void BaseQueryOneObject(){
        String sql = "select uid,username,user_pwd userPwd  from sys_user where uid = 1";
        Long is = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(is);
    }

    @Test
    public void BaseQuery(){
        // 由于没有驼峰式映射
        String sql = "select uid,username,user_pwd userPwd  from sys_user";
        List<SysUser> objects = baseDao.baseQuery(SysUser.class, sql);
        System.out.println(objects);
    }

    @Test
    public void BaseInsert(){
        String sql ="insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql, 1, "学习JAVA", 0);
        System.out.println(rows);
    }





}
