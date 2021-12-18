package com.demo.springcoreadproject.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcoreadproject/autowiring/byname/config.xml");
	Employee emp=(Employee) ac.getBean("Employee");
	System.out.println(emp);

	}

}
