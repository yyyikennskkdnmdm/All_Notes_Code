package com.javaweb.web_001_servlet.servlet_002_request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ser001_requestApi extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        System.out.println("requestURI = " + requestURI);

        StringBuffer requestURL = req.getRequestURL();
        System.out.println("requestURL = " + requestURL);

        String remoteHost = req.getRemoteHost();
        System.out.println("remoteHost = " + remoteHost);

        String header = req.getHeader("User-Agent");
        System.out.println("header = " + header);

        String method = req.getMethod();
        System.out.println("method = " + method);
    }
}
