package com.javaweb.web_001_servlet.servlet_003_response.servlet_003_rediret;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Redirect1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1 ");

        req.setAttribute("key1", "value1");

        // 设置响应状态码302 ，表示重定向，（已搬迁）
//        resp.setStatus(302);
        // 设置响应头，说明 新的地址在哪里
//        resp.setHeader("Location", "http://localhost:8080/07_servlet/response2");
//        resp.setHeader("Location", "http://localhost:8080");

        resp.sendRedirect("http://localhost:8080/redirect2");
    }
}
