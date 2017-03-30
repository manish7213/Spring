package com.manish.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/manish/spring/applicationContext.xml");
		//context.registerShutdownHook();
		ShapeInterface shape=(ShapeInterface)context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting",null,"Default Greeting",null));
		





	}

}
