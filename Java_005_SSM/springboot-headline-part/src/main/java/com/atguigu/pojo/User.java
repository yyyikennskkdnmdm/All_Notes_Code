package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName news_user
 */
@Data
public class User implements Serializable {

    @TableId
    private Integer uid;

    private String username;

    private String userPwd;

    private String nickName;

    @Version
    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    public User(Integer uid, String username, String userPwd, String nickName, Integer version, Integer isDeleted) {
        this.uid = uid;
        this.username = username;
        this.userPwd = userPwd;
        this.nickName = nickName;
        this.version = version;
        this.isDeleted = isDeleted;
    }
}