package com.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.dao.CustomerDAO;
import com.crm.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Transactional
	@Override
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}


	@Transactional
	@Override
	public void deleteCustomer(int customerId) {
		customerDAO.deleteCustomer(customerId);
	}

	@Transactional
	@Override
	public List<Customer> getCustomerList() {
		return customerDAO.getCustomerList();
	}

	@Transactional
	@Override
	public Customer getCustomer(int customerId) {
		return customerDAO.getCustomer(customerId);
	}

}
