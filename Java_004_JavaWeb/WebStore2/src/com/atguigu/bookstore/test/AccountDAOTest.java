package com.atguigu.bookstore.test;

import com.atguigu.bookstore.dao.AccountDAO;
import com.atguigu.bookstore.dao.impl.AccountDAOIml;
import com.atguigu.bookstore.domain.Account;
import org.testng.annotations.Test;


public class AccountDAOTest {

	AccountDAO accountDAO = new AccountDAOIml();
	
	@Test
	public void testGet() {
		Account account = accountDAO.get(1);
		System.out.println(account.getBalance()); 
	}

	@Test
	public void testUpdateBalance() {
		accountDAO.updateBalance(1, 50);
	}

}
