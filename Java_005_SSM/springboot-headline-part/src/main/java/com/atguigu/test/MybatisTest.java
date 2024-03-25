package com.atguigu.test;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }
}
