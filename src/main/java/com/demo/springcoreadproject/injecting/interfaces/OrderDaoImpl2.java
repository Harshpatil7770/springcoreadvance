package com.demo.springcoreadproject.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImpl2 implements OrderDao {

	public void orderPlaced() {
	System.out.println("Order Placed By OrderDaoImpl2");
	}

}
