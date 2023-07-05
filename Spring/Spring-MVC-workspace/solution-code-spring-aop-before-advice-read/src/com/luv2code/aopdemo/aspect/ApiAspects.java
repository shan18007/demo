 package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class ApiAspects {
	@Before("com.luv2code.aopdemo.aspect.MyCommonApsects.forDaoPackageNoGetterSetter()")
	public void beforeAdviceWithNoGetterSetter() {
		System.out.println("\n=====>>> ApiAspects");
	}
}
