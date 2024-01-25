package com.atguigu.bookstore.test;

import com.atguigu.bookstore.dao.TradeDAO;
import com.atguigu.bookstore.dao.impl.TradeDAOImpl;
import com.atguigu.bookstore.domain.Trade;
import org.junit.Test;

import java.sql.Date;
import java.util.Set;

public class TradeDAOTest {

	private TradeDAO tradeDAO = new TradeDAOImpl();
	
	@Test
	public void testInsertTrade() {
		Trade trade = new Trade();
		trade.setUserId(3);
		trade.setTradeTime(new Date(new java.util.Date().getTime()));
		
		tradeDAO.insert(trade);
	}

	@Test
	public void testGetTradesWithUserId() {
		Set<Trade> trades = tradeDAO.getTradesWithUserId(2);
		System.out.println(trades);
	}

}
