package com.brands;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Brand b = new Brand();
		b.setBrandId(52);
		b.setBrandName("Samsung");

		Models m = new Models();
		m.setModelId(5333);
		m.setModelName("M21");
		m.setBrand(b);

		Models m2 = new Models();
		m2.setModelId(5656);
		m2.setModelName("M31");
		m2.setBrand(b);

		Models m3 = new Models();
		m3.setModelId(51322);
		m3.setModelName("M41");
		m3.setBrand(b);

		List<Models> list = new ArrayList<Models>();
		list.add(m);
		list.add(m2);
		list.add(m3);
		b.setModels(list);

		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();

		session.close();
		factory.close();
	}
}
