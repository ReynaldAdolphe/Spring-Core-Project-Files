package com.spring.ioc.DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		try {
			TextEditor te = (TextEditor) context.getBean("textEditor");
			te.spellCheck();
		} finally {
			context.close();
		}

	}
}
