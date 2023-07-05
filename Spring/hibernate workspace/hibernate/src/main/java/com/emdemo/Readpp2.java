package com.emdemo;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Readpp2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();
		try {
//			session.beginTransaction();
//
//			session.getTransaction().commit();
			// reading
//			Student st = session.get(Student.class, 1);
//			System.out.println(st);
//			session.delete(st);
			
			
			//using org.hibernate.query.*; 
			Query q= session.createQuery("from Student where course=:n");
			q.setParameter("n", "Java");
			List<Student> list=q.getResultList();
			
			for(Student s:list) {
				System.out.println(s.id+" "+s.name+" "+s.getCerti().course+" "+s.getCerti().getDuration());
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
