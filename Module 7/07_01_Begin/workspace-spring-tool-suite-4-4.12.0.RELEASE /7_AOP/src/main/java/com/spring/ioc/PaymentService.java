package com.spring.ioc;

public class PaymentService {

	public void payEmployee(String employeeId) {
		System.out.println("Payment sent! : " + employeeId);
	}

	public void clearPayRequest(String employeeId) {
		System.out.println("Payment request cleared : " + employeeId);
	}
}
