package com.spring.ioc.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("employee1")
	private Employee employee;

	public Profile() {
		System.out.println("Inside Profile constructor.");
	}

	public void printAge() {
		System.out.println("Age : " + employee.getAge());
	}

	public void printName() {
		System.out.println("Name : " + employee.getName());
	}
}