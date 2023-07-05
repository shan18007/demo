package com.emdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.learn.entity.Artist;

public class Readpp3 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Artist.class).buildSessionFactory();
		Session session = factory.openSession();
		try {
//			session.beginTransaction();
//
//			session.getTransaction().commit();
			// reading
//			Student st = session.get(Student.class, 1);
//			System.out.println(st);
//			session.delete(st);

			// org.hibernate Query is deprecated

			NativeQuery mySQLQuery = session.createSQLQuery(
					"select * from song s,artist a where s.artist_artistId = a.artistId and s.songName = 'Jadu teri najar'");

			mySQLQuery.addEntity(Artist.class);

			List list2 = mySQLQuery.list();

			System.out.println(list2);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
