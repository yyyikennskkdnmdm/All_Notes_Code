package com.atguigu.bookstore.test;

import com.atguigu.bookstore.dao.UserDAO;
import com.atguigu.bookstore.dao.impl.UserDAOImpl;
import com.atguigu.bookstore.domain.User;
import org.junit.Test;

public class UserDAOTest {

	private UserDAO userDAO = new UserDAOImpl();
	
	@Test
	public void testGetUser() {
		User user = userDAO.getUser("AAA");
		System.out.println(user); 
	}

}
