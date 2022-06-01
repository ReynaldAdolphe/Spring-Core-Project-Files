package com.spring.ioc;

import org.springframework.beans.factory.BeanNameAware;

public class SampleBean implements BeanNameAware {

	private String beanName;

	public SampleBean() {

	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void displayName() {
		System.out.println(beanName);
	}
}
