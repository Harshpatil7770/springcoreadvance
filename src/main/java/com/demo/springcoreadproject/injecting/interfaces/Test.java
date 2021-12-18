package com.demo.springcoreadproject.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(" com/demo/springcoreadproject/injecting/interfaces/config.xml");
		OrderBO orderBo=(OrderBO) ac.getBean("bo");
		orderBo.createOrder();

	}

}
