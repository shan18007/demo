package com.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Answer;
import com.learn.entity.Question;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "App Started" );
        
        SessionFactory factory=new Configuration().configure()
        		.addAnnotatedClass(Answer.class).addAnnotatedClass(Question.class)
        		.buildSessionFactory();
        try {
        	 Session session=factory.openSession();
        	 
        	
        	 Question q=new Question();
        	 q.setQ_id(763);
        	 q.setQuestion("what is java?");
        	 
        	 Answer ans=new Answer();
        	 ans.setAns_id(1051);
        	 ans.setAnswer("java is programming language");
        	 ans.setQue(q);
        	 
        	 q.setAns(ans);
        	 
        	
        	 Question q1=new Question();
        	 q1.setQ_id(546);
        	 q1.setQuestion("what is collection?");
        	 
        	 Answer ans1=new Answer();
        	 ans1.setAns_id(302);
        	 ans1.setAnswer("collection is API to work with objects.");
        	 ans1.setQue(q1);
        	 q1.setAns(ans1);
        	 
        	 
             session.beginTransaction();
             session.save(ans);
             session.save(ans1);
             session.save(q);
             session.save(q1);
             session.getTransaction().commit();
             
             //fetching question
             Question question=(Question)session.get(Question.class, 763);
             System.out.println(question.getQuestion());
             System.out.println(question.getAns().getAnswer());
             
             //fetching answer
             //in unidirectional we can access answer by using question(we used @oneToone on question)
             //but we cannot access question by using answer
             //for this we have to use bidirectional mapping(@used oneToone in both)
             Answer an=(Answer)session.get(Answer.class, 302);
             System.out.println(an.getAnswer());
             System.out.println(an.getQue().getQuestion());
             
             session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
       finally {
		factory.close();
	}
      
        
    }
}

