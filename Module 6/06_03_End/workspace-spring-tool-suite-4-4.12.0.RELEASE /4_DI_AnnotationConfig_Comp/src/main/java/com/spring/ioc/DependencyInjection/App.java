package com.spring.ioc.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");

		Phone p = ctx.getBean("galaxy", Phone.class);
		p.calling();
		p.data();

	}
}
