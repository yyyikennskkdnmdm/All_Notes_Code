package com.javaweb.web_001_servlet.servlet_001_helloservlet;

import org.testng.annotations.Test;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet_001 implements Servlet {


    @Test
    public void test() {
        System.out.println("HelloServlet_001是否有乱码");

    }
    public HelloServlet_001() {

        System.out.println("1.构造器方法");

    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    /**
     * service方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.service == Hello Servlet 被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            doGet();
        }else if("POST".equals(method)){
            doPost();
        }
    }

    public void doGet() {


    }

    public void doPost(){
        System.out.println("post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destroy方法");
    }
}
