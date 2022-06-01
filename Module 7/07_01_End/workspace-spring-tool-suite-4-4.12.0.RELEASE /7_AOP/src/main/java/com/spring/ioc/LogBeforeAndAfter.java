package com.spring.ioc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAndAfter {
	@Before("execution(* PaymentService.*(..))")
	public void before(JoinPoint jp) {
		System.out
				.println("Entered : " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName());
	}

	@After("execution(* PaymentService.*(..))")
	public void after(JoinPoint jp) throws Throwable {
		System.out.println("Exit : " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName());
	}

}
