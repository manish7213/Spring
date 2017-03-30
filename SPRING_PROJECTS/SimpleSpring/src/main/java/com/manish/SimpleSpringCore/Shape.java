package com.manish.SimpleSpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangle tr=new Triangle();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/manish/SimpleSpringCore/applicationContext.xml");
		
		Triangle tr=(Triangle)context.getBean("triangle");
		
		tr.draw();
		
		

	}

}
