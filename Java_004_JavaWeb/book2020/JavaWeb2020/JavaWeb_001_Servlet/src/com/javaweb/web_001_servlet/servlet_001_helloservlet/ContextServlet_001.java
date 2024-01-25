package com.javaweb.web_001_servlet.servlet_001_helloservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet_001 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();

        System.out.println("username = " + servletContext.getInitParameter("username"));
        System.out.println("password = " + servletContext.getInitParameter("password"));

        System.out.println("contextPath = " + servletContext.getContextPath());

        System.out.println("RealPath = " + servletContext.getRealPath("/"));
        System.out.println("css/RealPath = " + servletContext.getRealPath("/css"));
        System.out.println("ims/RealPath = " + servletContext.getRealPath("/imgs/1.jpg"));
    }
}
