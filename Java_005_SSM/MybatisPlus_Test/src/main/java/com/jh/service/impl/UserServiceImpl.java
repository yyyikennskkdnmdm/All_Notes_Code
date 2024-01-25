package com.jh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jh.pojo.User;
import com.jh.service.UserService;
import com.jh.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author a7249
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-01-17 19:22:03
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




