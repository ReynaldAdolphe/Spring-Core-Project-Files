package com.spring.ioc.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("app-config.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		Phone p = ctx.getBean(IPhone.class);
		p.calling();
		p.data();

	}
}
