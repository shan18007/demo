package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class LoggingDemoAspect {

	@Around("execution(* com.luv2code.aopdemo.services.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("\\n=====>>> Executing Around Advice on getFortune()");
		// it will call to the target method
		// lets execute the method

		long begin = System.currentTimeMillis();
		Object result = null;
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			result = "Major accident..! but dont worry will send you helicopter.";
		}

		long end = System.currentTimeMillis();

		long duration = end - begin;
		System.out.println("duration: " + duration / 1000.0 + "seconds");
		return result;
	}

	// after advice run always even if we get exception or not
	// run always for both cases success or failure
	// after advice run before exception advice i.e after Throw
//	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
//	public void afterFindAccountAdvice(JoinPoint joinpoint) {
//		String sig = joinpoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing After Advice on Method: "+sig);
//	}
//
//	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))", returning = "result")
//	public void afterReturningFindAccountAdvice(JoinPoint joinpoint, List<Account> result) {
//		String sig = joinpoint.getSignature().toShortString();
//		System.out.println("\n=====>>> Executing After Returning Advice on Method: "+sig);
//		System.out.println("Result is: "+result);
//	}
//
//	@Before("com.luv2code.aopdemo.aspect.MyCommonApsects.forDaoPackageNoGetterSetter()")
//	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
//		System.out.println("\n=====>>> Executing  LoggingDemoAspect");
//
//		// display method signature
//		MethodSignature sig = (MethodSignature) joinPoint.getSignature();
//		System.out.println("Mthod Siganture: " + sig);
//
//		// display method args
//
//		Object[] ob = joinPoint.getArgs();
//
//		for (Object o : ob) {
//
//			System.out.println(o);
//			if (o instanceof Account) {
//				Account a = (Account) o;
//				System.out.println("Name: " + a.getName());
//				System.out.println("level: " + a.getLevel());
//			}
//		}
//
//	}

}
