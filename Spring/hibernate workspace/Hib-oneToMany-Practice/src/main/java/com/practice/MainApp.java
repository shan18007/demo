package com.practice;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp 
{
    public static void main( String[] args )
    {
    	
    Configuration cfg=new Configuration();
    cfg.configure();
    SessionFactory factory=cfg.buildSessionFactory();
    
    Session session=factory.openSession();
    
    Question q=new Question();
    q.setQ_Id(344);
    q.setQuestion("what is API?");
    
    Answer an=new Answer();
    an.setAns_Id(222);
    an.setAns("Application programming interface");
    an.setQue(q);
    
    Answer an1=new Answer();
    an1.setAns_Id(342);
    an1.setAns("collection of classes and interfaces");
    an1.setQue(q);
    
    Answer an2=new Answer();
    an2.setAns_Id(3872);
    an2.setAns("API has methods");
    an2.setQue(q);
    
    ArrayList<Answer> list=new ArrayList<Answer>();
    list.add(an);
    list.add(an1);
    list.add(an2);
    q.setAnswer(list);
    
    
    
    session.beginTransaction();
    session.save(an);
    session.save(an1);
    session.save(an2);
    session.save(q);
    session.getTransaction().commit();
    
    //fetching
    
    System.out.println(q.getQ_Id()+")"+q.getQuestion());
    
    for(Answer a: q.getAnswer()) {
    	System.out.println(a.getAns());
    }
    
    session.close();
    }
}
