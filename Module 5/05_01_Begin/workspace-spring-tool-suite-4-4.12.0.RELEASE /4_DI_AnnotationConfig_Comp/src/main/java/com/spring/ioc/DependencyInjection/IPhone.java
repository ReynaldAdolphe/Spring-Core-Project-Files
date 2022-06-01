package com.spring.ioc.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class IPhone implements Phone {

	public void calling() {
		System.out.println("Calling using iPhone");

	}

	public void data() {
		System.out.println("Browsing internet using iPhone");

	}

}
