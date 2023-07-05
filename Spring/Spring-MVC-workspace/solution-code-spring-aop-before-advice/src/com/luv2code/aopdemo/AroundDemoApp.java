package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.services.FortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		FortuneService theFortuneService = context.getBean("fortuneService", FortuneService.class);

		//use flag to generate expcetion in around advice
		String fortune = theFortuneService.getFortune(true);
		
		System.out.println("Main Program: ");
		System.out.println("Fortune is: "+fortune);
		System.out.println("Finish");
		// close the context
		context.close();
	}

}
