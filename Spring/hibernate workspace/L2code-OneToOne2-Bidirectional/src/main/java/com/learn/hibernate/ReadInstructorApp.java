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
			session.beginTransaction();
			instructor2.getInstructorDetail().setHobby("asfff");
			instructor2.setLastName("bbbb");
			session.persist(instructor2);

//			Instructor instructor3 = session.get(Instructor.class, 1);
//			System.out.println("ins3: "+instructor3);
//			System.out.println("fetch: " + instructor3.getLastName());
//			session.delete(instructor2);
			session.getTransaction().commit();

//			session.persist(instructor2);

//			Instructor instructor3 = session.get(Instructor.class, 4);

			session.close();

			// laod Examples
//			Instructor instructor4 = session.load(Instructor.class, 1);
//			Instructor instructor5 = session.load(Instructor.class, 1);

//			System.out.println("fisrtName: "+instructor4.getFirstName());
//			System.out.println("details: "+instructor4.getInstructorDetail());
//			System.out.println(instructor2);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}

	}
}
