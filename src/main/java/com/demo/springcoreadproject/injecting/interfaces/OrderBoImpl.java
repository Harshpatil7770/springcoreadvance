package com.demo.springcoreadproject.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {
@Autowired
@Qualifier("dao2")
	private OrderDao dao;
	
	public void createOrder() {
		System.out.println("==== Order created=====");
		dao.orderPlaced();

	}



	public OrderDao getDao() {
		return dao;
	}



	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

}
