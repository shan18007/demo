//package com.learn.hibernate;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.learn.entity.Answer;
//import com.learn.entity.Question;
//
//public class ReadApp 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "App Started" );
//        
//        SessionFactory factory=new Configuration().configure()
//        		.addAnnotatedClass(Answer.class).addAnnotatedClass(Question.class)
//        		.buildSessionFactory();
//        try {
//        	 Session session=factory.openSession();
//        	 
//        	 session.beginTransaction();
//        	 Question q=session.get(Question.class, 763);
//        	 session.delete(q);
//             
//           session.getTransaction().commit();
//             //fetching answer
//             //in unidirectional we can access answer by using question(we used @oneToone on question)
//             //but we cannot access question by using answer
//             //for this we have to use bidirectional mapping(/@used oneToone in both)
////             Answer an=(Answer)session.get(Answer.class, 302);
////             System.out.println(an.getAnswer());
////             System.out.println(an.getQue().getQuestion());
//             
//             session.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//       finally {
//		factory.close();
//	}
//      
//        
//    }
//}
//
