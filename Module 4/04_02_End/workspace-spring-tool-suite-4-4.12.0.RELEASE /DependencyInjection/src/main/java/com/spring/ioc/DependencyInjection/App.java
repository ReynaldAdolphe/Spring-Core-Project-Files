package com.spring.ioc.DependencyInjection;

public class App {
	public static void main(String[] args) {
		Phone p = new Galaxy();
		p.calling();
		p.data();

	}
}
