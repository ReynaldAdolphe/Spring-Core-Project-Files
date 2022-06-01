package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");

		sampleBean.displayName();

	}
}
