package com.demo.springcoreadproject.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext(" com/demo/springcoreadproject/autowiring/annotations/config.xml");
	Employee emp=(Employee) ac.getBean("employee");
	System.out.println(emp);
	}

}
