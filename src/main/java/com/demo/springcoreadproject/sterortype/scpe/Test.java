package com.demo.springcoreadproject.sterortype.scpe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcoreadproject/sterortype/scpe/config.xml");
	
	Instructor instructor=(Instructor) ac.getBean("inst");
	System.out.println(instructor);
	

	

	}

}
