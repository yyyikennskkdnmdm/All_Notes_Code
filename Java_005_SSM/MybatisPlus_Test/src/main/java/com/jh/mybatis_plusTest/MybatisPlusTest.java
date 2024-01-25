package com.jh.mybatis_plusTest;


import com.jh.mapper.UserMapper;
import com.jh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;




    @Test
    public void MybatisPlusTest001(){
        List<User> users = userMapper.selectList(null);
        for (User user: users){
            System.out.println(user);
        }
    }

    @Test
    public void MybatisPlusTest002(){
        User user = new User();
//        user.setId(6L);
        user.setAge(88);
        user.setName("呵呵呵2");
        user.setEmail("xxxx");
        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
    }

    @Test
    public void MybatisPlusTest003() {
        int i = userMapper.deleteById(6L);
        System.out.println("i = " + i);
    }





}
