package com.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Instructor;
import com.learn.entity.InstructorDetail;

public class CreateInstructorApp {
	public static void main(String[] args) {
		System.out.println("App Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		System.out.println("factory : " + factory);
		try {
			Session session = factory.openSession();

			session.beginTransaction();

			Instructor instructor = new Instructor();
			instructor.setFirstName("rushi");
			instructor.setLastName("bhiwari");

			InstructorDetail insDetail = new InstructorDetail();
			insDetail.setHobby("MUSIC");
			insDetail.setYoutubeChannel("jetbrain");
			instructor.setInstructorDetail(insDetail);
			
			session.save(instructor);
			
			
			session.getTransaction().commit();
			
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}

	}
}
