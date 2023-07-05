package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterMainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		try {  
			//using flag for exception
			boolean flag = false;
			theAccountDAO.findAccounts(flag);
		} catch (Exception e) {
			System.out.println("Main caught exception: " + e);
		}

		
//	
		// close the context
		context.close();
	}

}
