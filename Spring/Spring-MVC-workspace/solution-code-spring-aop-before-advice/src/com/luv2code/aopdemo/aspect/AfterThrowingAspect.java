package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class AfterThrowingAspect {

//	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))", returning = "result")
//	public void afterReturningFindAccountAdvice(JoinPoint joinpoint, List<Account> result) {
//		String sig = joinpoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing After Returning Advice on Method: "+sig);
//		System.out.println("Result is: "+result);
//	}
	
	@AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))", throwing = "theEx")
	public void afterThrowingOnFindAccounts(JoinPoint joinpoint,Throwable theEx) {
		String sig = joinpoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing After Throwing Advice on Method: "+sig);
		System.out.println("The exception is: "+theEx);
	}


}
