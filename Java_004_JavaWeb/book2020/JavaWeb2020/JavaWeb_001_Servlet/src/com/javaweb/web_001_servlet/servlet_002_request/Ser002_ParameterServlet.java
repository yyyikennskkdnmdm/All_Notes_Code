package com.javaweb.web_001_servlet.servlet_002_request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class Ser002_ParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("username = " + username);

        String characterEncoding1 = req.getCharacterEncoding();
        System.out.println("characterEncoding = " + characterEncoding1);
        req.setCharacterEncoding("GBK");
        String characterEncoding = req.getCharacterEncoding();
        System.out.println("characterEncoding = " + characterEncoding);

        System.out.println("username = " + username);
        String password = req.getParameter("password");
        System.out.println("password = " + password);
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("hobby = " + hobby);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求体的字符集为UTF-8，从而解决post请求的中文乱码问题
        // 也要在获取请求参数之前调用才有效
        req.setCharacterEncoding("UTF-8");

        System.out.println("-------------doPost------------");
        // 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("兴趣爱好：" + Arrays.asList(hobby));
    }
}
