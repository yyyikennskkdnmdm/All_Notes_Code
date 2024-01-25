package com.atguigu.service.impl;


import com.atguigu.dao.SysUserDao;
import com.atguigu.dao.impl.SysUserDaoImpl;


import com.atguigu.pojo.SysUser;
import com.atguigu.util.MD5Util;
import com.atguigu.service.SysUserService;

public class SysUserServiceImpl  implements SysUserService {
    private SysUserDao userDao =new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {

        // 将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        // 调用DAO 层的方法  将sysUser信息存入数据库
        return userDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
