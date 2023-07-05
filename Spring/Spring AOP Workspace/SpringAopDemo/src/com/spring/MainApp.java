package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aopdemo.DemoConfig;
import com.spring.aopdemo.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		// read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from spring container
		AccountDAO ac = context.getBean("accountDAO", AccountDAO.class);
		// call the business method
		ac.addAccount();
		
		//calling once again
		ac.addAccount();
		// close the context
		context.close();
	}
}
