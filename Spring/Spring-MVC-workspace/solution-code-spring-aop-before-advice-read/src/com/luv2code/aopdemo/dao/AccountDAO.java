package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public boolean addAccount() {

		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		return false;
	}

	public void getAccount() {
		System.out.println(getClass() + ":Getting: AN ACCOUNT");
	}
}
