package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DB {

	SessionFactory factory = null;

	public SessionFactory getFactory() {
		try {
			factory = new Configuration().configure().buildSessionFactory();

		} catch (Exception e) {
			System.out.println(e);
		}

		return factory;
	}
}
