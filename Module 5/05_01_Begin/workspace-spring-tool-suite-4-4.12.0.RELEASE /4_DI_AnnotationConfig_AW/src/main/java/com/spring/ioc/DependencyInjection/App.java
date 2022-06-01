package com.spring.ioc.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
