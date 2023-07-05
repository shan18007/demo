package com.emdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Readpp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();
		try {
//			session.beginTransaction();
//
//			session.getTransaction().commit();
			// reading
			Student st = session.get(Student.class, 1);
			System.out.println("1st: "+st);
			Session session2 = factory.getCurrentSession();
			Student sst = session2.get(Student.class, 1);
			System.out.println("2nd: "+sst);
//			session.delete(st);
			
			//org.hibernate Query is deprecated
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
