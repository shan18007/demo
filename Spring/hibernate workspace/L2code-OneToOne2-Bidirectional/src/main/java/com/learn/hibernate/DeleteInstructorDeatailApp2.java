package com.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Instructor;
import com.learn.entity.InstructorDetail;

public class DeleteInstructorDeatailApp2 {
	public static void main(String[] args) {
		System.out.println("App Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		System.out.println("factory : " + factory);
		Session session = factory.openSession();
		try {

			session.beginTransaction();


			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 3);
			System.out.println("Name: "+instructorDetail.getInstructor().getFirstName());
			System.out.println("hobby: "+instructorDetail.getHobby());
			
			//since it is bidirectional mapping
			//first we have to remove the association between them
			instructorDetail.getInstructor().setInstructorDetail(null);
			
			//now we can safely delete
			session.delete(instructorDetail);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			factory.close();
		}

	}
}
