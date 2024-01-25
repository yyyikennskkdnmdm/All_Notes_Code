package com.atguigu.bookstore.filter;

import com.atguigu.bookstore.db.JDBCUtils;
import com.atguigu.bookstore.web.ConnectionContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Servlet Filter implementation class TranactionFilter
 */
public class TranactionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TranactionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		Connection connection = null;
		
		try {
			
			//1. ???????
			connection = JDBCUtils.getConnection();
			
			//2. ????????
			connection.setAutoCommit(false);
			
			//3. ???? ThreadLocal ?????????????
			ConnectionContext.getInstance().bind(connection);
			
			//4. ???????????? Servlet
			chain.doFilter(request, response);
			
			//5. ??????
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			//6. ???????
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpServletRequest req = (HttpServletRequest) request;
			resp.sendRedirect(req.getContextPath() + "/error-1.jsp");
			
		} finally{
			//7. ?????
			ConnectionContext.getInstance().remove();
			
			//8. ???????
			JDBCUtils.release(connection);
			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
