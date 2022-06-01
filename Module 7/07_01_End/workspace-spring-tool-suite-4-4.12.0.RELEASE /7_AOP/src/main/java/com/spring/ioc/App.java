package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		try {
			PaymentService ps = (PaymentService) context.getBean("paymentService");
			ps.payEmployee("emp2500");
			ps.clearPayRequest("emp2500");

		} finally {
			context.close();
		}

	}
}
