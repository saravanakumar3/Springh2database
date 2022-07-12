package com.luciddreamerpsk.comon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Springbootexample.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		obj.printHello();}}
