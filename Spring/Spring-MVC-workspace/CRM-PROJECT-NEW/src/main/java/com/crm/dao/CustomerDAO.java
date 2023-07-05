package com.crm.dao;

import java.util.List;

import com.crm.entity.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);
	public void deleteCustomer(int customerId);
	public List<Customer> getCustomerList();
	public Customer getCustomer(int customerId);
}
