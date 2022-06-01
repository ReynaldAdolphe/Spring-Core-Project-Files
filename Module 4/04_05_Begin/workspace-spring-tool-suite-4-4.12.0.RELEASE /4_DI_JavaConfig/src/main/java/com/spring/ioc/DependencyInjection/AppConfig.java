package com.spring.ioc.DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Galaxy galaxyService() {
		return new Galaxy();
	}

	@Bean
	public IPhone iPhoneService() {
		return new IPhone();
	}
}
