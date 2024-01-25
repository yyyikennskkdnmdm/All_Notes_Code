package com.atguigu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * TODO servlet：通过request获取uri，从uri中获取方法名，通过反射调用方法
 */
public class BaseContoller extends HttpServlet {// TODO  HttpServlet
    // 1 .当前端提交数据的时候，会根据webservlet注释找到响应的controller，每个controller都继承了baseController
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 2. 从请求体中获取uri，例如/user/checkUsernameUsed
        String requestURI = req.getRequestURI();

        String[] split = requestURI.split("/");

        // 3.从uri中获取我们应该调用controller中的那些方法的方法的名字 例如 checkUsernameUsed
        String methodName = split[split.length-1];

        // 4.由于 SysUserController继承了BaseController，所以在SysUserController中会自动执行service方法,此时会通过反射得到这个类的实体
        Class aClass = this.getClass();

        try {
            // 5.使用反射获取实体的对应的方法 并执行
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

            //暴力 破解方法的访问修饰符的限制
            declaredMethod.setAccessible(true);

            // 执行方法
            declaredMethod.invoke(this,req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
