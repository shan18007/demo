package com.pra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().
    			buildSessionFactory();
		
    		Session session=factory.openSession();
    		System.out.println("1st session");
    		Artist a1=session.get(Artist.class, 3424);
    		System.out.println(a1.getArtistName());
    		session.close();
    		
    		Session session2=factory.openSession();
    		System.out.println("2nd session");
    		Artist a2= session2.get(Artist.class, 3424);
    		System.out.println(a2.getArtistName());
    		session2.close();
			
	}

}
