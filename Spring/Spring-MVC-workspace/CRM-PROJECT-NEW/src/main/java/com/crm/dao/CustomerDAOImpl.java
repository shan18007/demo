package com.crm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory factory;
	Session session = null;

	@Override
	public void addCustomer(Customer customer) {
		session = factory.getCurrentSession();
		session.saveOrUpdate(customer);
	}


	@Override
	public void deleteCustomer(int customerId) {
		session = factory.getCurrentSession();

		Query query = session.createQuery("delete from Customer where customerId=:custId");
		query.setParameter("custId", customerId);
		query.executeUpdate();
//		session.delete(session.get(Customer.class, customerId));
	}

	@Override
	public List<Customer> getCustomerList() {
		session = factory.getCurrentSession();
		List<Customer> list = session.createQuery("from Customer order by customerName", Customer.class)
				.getResultList();
//		System.out.println("LIST vals :" + list);
//		list.forEach(l -> System.out.println(l));
		return list;
	}

	@Override
	public Customer getCustomer(int customerId) {
		session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, customerId);
		return customer;
	}

}
