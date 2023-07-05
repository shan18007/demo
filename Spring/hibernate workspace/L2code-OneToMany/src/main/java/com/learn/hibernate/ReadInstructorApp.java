package com.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Instructor;
import com.learn.entity.InstructorDetail;

public class ReadInstructorApp {
	public static void main(String[] args) {
		System.out.println("App Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		System.out.println("factory : " + factory);
		try {
			Session session = factory.openSession();

//			get examples
			Instructor instructor2 = session.get(Instructor.class, 5);
//			session.beginTransaction();

			System.out.println("instruc: "+instructor2);
			session.delete(instructor2);
			
//			session.getTransaction().commit();

			session.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}

	}
}
