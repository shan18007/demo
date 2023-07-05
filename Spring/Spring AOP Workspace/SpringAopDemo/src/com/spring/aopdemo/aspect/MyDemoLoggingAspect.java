package com.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all our related advices for logging
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("\n\n====>> Executing @before addAccount()");
	}
}
