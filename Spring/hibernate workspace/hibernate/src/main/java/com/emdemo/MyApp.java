package com.emdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();

		Certificate certi = new Certificate();
		certi.setCourse("Java");
		certi.setDuration("3 months");
		Student st = new Student("vijay devarkonda", certi);

		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();

	}

}
