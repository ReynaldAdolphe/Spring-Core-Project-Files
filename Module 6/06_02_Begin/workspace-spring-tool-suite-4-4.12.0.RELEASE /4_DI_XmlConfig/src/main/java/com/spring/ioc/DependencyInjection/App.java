package com.spring.ioc.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Phone p = new Galaxy();
		// p.calling();
		// p.data();

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		// System.out.println("config loaded.");

		Phone p = ctx.getBean("phone", Phone.class);
		p.calling();
		p.data();

	}
}
