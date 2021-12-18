package com.demo.springcoreadproject.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcoreadproject/autowiring/assignment/config.xml");
	Customer customer=(Customer) ac.getBean("customer");
	System.out.println(customer);
	}

}
