package com.demo.springcoreadproject.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(" com/demo/springcoreadproject/stereotype/annotations/config.xml");
		
		Instructor instructor=(Instructor) ac.getBean("instructor");
		System.out.println(instructor);

	}

}
