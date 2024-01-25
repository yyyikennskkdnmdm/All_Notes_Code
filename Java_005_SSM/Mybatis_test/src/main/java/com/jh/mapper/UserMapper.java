package com.jh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jh.pojo.User;

import java.util.List;

/**
* @author a7249
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-01-11 18:10:53
* @Entity com.jh.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    List<User> selectAll();

}
