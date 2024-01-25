package com.jh.test;

import com.jh.mapper.UserMapper;
import com.jh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;

public class UserMapperTest {



    @Test
    public void testSelectUser() throws IOException {
        // 1.读取外部配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 3.根据sqlSessionFactory创建sqlSession(每次业务创建一个，用完就释放）
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.获取接口的代理对象（代理技术）调用代理对象的方法，就会查找mapper接口的方法
        // jsk动态代理技术生成的mapper代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 内部拼接接口的全限定符号.方法 去查找sql语句标签
        // 1.拼接类的全限定符.方法名 整合参数 -> ibatis对应的方法传入参数
        // mybatis底层仍然调用ibatis只不过有固定的模式！
        User user = mapper.selectByPrimaryKey(1L);
        System.out.println(user);

        for (User user1 : mapper.selectAll()) {
            System.out.println(user1);
        }


        // 5.提交事务（非DQL）和释放资源
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testInsertUser() throws IOException {
        // 1.读取外部配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 3.根据sqlSessionFactory创建sqlSession(每次业务创建一个，用完就释放）
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4.获取接口的代理对象（代理技术）调用代理对象的方法，就会查找mapper接口的方法
        // jsk动态代理技术生成的mapper代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setUsername("shenyige");
        user.setPassword("123456");

        int i = mapper.insertSelective(user);

        sqlSession.commit();
        sqlSession.close();
    }


}
