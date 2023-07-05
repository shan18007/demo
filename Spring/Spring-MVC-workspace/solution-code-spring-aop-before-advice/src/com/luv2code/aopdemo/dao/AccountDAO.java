package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public boolean addAccount(Account a, boolean b) {

		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		return false;
	}
	
	public List<Account> findAccounts(boolean b) {
		if(b) {
			throw new RuntimeException("Ops..! no Data found...!!");
		}
		List<Account> list =new ArrayList<Account>();
		list.add(new Account("Rohit", "Gold"));
		list.add(new Account("Virat", "Bronze"));
		list.add(new Account("Hardik", "Concurer"));
		return list;
	}

	public void getAccount() {
		System.out.println(getClass() + ":Getting: AN ACCOUNT");
	}
}
