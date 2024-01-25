package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.utils.Result;
import com.atguigu.utils.ResultCodeEnum;
import org.testng.annotations.Test;

public class ResultTest {
    @Test
    public void ResultTest001(){
        ResultCodeEnum success = ResultCodeEnum.SUCCESS;
        System.out.println(success);

        Result<User> result = new Result<>();
        result.setCode(1);
        result.setMessage("6666");
        result.message("message");
        result.code(2);

        User user = new User(1,"jianghao","woshixh212","jh",1,1);
        result.setData(user);

        System.out.println(result);
    }

    @Test
    public void ResultTest002(){
        User user = new User(1,"jianghao","woshixh212","jh",1,1);
        Result<User> ok = Result.ok(user);
        System.out.println(ok);
    }

    @Test
    public void ResultTest003(){
        Result<Object> build = Result.build(null, ResultCodeEnum.PASSWORD_ERROR);
        System.out.println(build);

        Result<Object> mycode = Result.build(null, 5000, "mycode");
        System.out.println(mycode);
    }
}
