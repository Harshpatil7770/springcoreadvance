package com.demo.springcoreadproject.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDaoImpl implements OrderDao {

	public void orderPlaced() {
    System.out.println("=== Order Placed ====");

	}

}
