package com.atguigu.filter;


import com.atguigu.pojo.SysUser;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
//                          showSchedule.html

/**
 * 防止用户没有登录直接进入schedule界面
 */


@WebFilter(urlPatterns = {"/showSchedule.html","/schedule/*"})
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 参数父转子
        HttpServletRequest request =(HttpServletRequest)  servletRequest;
        HttpServletResponse response  =(HttpServletResponse) servletResponse;
        /*
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
..........
        }else{
            // 登录成功之后,将登录的用户信息放入session
            HttpSession session = req.getSession(); TODO 登录成功会设置session
            session.setAttribute("sysUser",loginUser);
            //4 跳转到首页
            resp.sendRedirect("/showSchedule.html");
        }
    }
 */
        // 获得session域对象
        HttpSession session = request.getSession();
        // 从session域中获得登录的用户对象
        SysUser sysUser = (SysUser)session.getAttribute("sysUser");
        // 判断用户对象是否为空
        if(null == sysUser){
            // 没登录 到login.html
            response.sendRedirect("/login.html");
        }else{
            // 登录过 放行
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
}
