package com.pra;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main( String[] args )
    {

    	SessionFactory factory=new Configuration().configure().
    			addAnnotatedClass(Artist.class).
    			addAnnotatedClass(Song.class). 
    			buildSessionFactory();
    	try {
    	Session session=factory.openSession();
    	System.out.println("1st session");
    	Song song=new Song();
    	song.setSongId(334);
    	song.setSongName("Jadu teri najar");
    	
    	Song song2=new Song();
    	song2.setSongId(531);
    	song2.setSongName("sochenge tumhe pyar");
    	
    	Song song3=new Song();
    	song3.setSongId(323);
    	song3.setSongName("chehra kya dekhte ho");
    	
    	Artist artist=new Artist();
    	artist.setArtistId(3424);
    	artist.setArtistName("Kumar Sanu");
    	
    	song.setArtist(artist);
    	song2.setArtist(artist);
    	song3.setArtist(artist);
    	
    	List<Song> songList=new ArrayList<Song>();
    	songList.add(song);
    	songList.add(song2);
    	songList.add(song3);
    	
    	artist.setSong(songList);
    	
    	session.beginTransaction();
    	
    	session.save(artist);
    	
    	session.getTransaction().commit();
    	
    	session.get(Artist.class, 3424);
    	session.close();
    	
    	
    	}catch (Exception e) {
    		System.out.println(e);
    	}
    
    }
}
