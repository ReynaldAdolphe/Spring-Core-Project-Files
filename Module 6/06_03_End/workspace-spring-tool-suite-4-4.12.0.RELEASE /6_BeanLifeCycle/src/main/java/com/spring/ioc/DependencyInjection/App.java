package com.spring.ioc.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		try {
			System.out.println("My main method statement");
			TextEditor te = (TextEditor) context.getBean("textEditor");
			te.spellCheck();
		} finally {
			context.close();
		}

	}
}
