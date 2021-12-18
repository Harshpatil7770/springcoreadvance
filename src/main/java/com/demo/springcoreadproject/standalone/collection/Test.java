package com.demo.springcoreadproject.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcoreadproject/standalone/collection/config.xml");
Product prod=(Product) ac.getBean("product");
	System.out.println(prod);
	}

}
