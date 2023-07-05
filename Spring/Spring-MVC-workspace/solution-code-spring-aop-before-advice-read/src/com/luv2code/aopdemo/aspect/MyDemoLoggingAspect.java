package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	
	// let's start with an @Before advice

//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	
	//match with any method of any class starting with add
//	@Before("execution(public void add*())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	//modifier is optional
	//matching with any return type
//	@Before("execution(boolean add*())")
//	public void beforeAddAccountAdvice() {
//		
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	//matching with any return type
	//any return type with addAcount method having 0 or any n number of paramater
//	@Before("execution(* addAccount(..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	} 
	
//	any return type from this package with any class any method any params
//	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	} 
	
//	@After("execution(public void updateAccount())")
//	public void beforeAddAccountAdvices() {
//		 
//		System.out.println("\n=====>>> Executing @After advice on updateAccount()");
//		
//	}
	
	
//	instead of declaring pointcut expression in each method we can create a new pointcut expression and can apply 
//	 so we can reuse 
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {
		 
	}
	

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {
		 
	}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {
		 
	}

	//combining pointcut expression 
	// matching from package with no getter and setters 
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {
	}
	
//	@Before("forDaoPackage()")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====>>> Executing @Before advice on any method of dao");
//	}
//	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAdviceWithNoGetterSetter() {
		System.out.println("\n=====>>> Executing @Before advice with beforeAdviceWithNoGetterSetter");
	}
}










