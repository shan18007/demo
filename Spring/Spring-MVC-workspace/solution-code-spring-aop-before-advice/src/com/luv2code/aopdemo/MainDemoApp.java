package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
//		theAccountDAO.findAccounts();
		
//		Account ac=new Account("Shan","Silver");
		
		// call the business method
//		theAccountDAO.addAccount(ac, true);
//		theAccountDAO.getAccount();

//		MembershipDAO mDAO = context.getBean("membershipDAO", MembershipDAO.class);
//		mDAO.addAccount();

		// close the context
		context.close();
	}

}
