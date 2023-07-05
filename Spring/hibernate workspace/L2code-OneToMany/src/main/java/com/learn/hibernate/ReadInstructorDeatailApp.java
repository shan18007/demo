package com.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Instructor;
import com.learn.entity.InstructorDetail;

public class ReadInstructorDeatailApp {
	public static void main(String[] args) {
		System.out.println("App Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		System.out.println("factory : " + factory);
		Session session = factory.openSession();
		try {
			

			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 3);
			System.out.println(instructorDetail.getInstructor());
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			factory.close();
		}

	}
}
