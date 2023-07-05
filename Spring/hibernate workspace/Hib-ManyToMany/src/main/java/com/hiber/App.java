package com.hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        try {
        Session session= factory.openSession();
        
        Emp emp1=new Emp();
        emp1.setE_id(234);
        emp1.setName("Animesh Band");
        
        Emp emp2=new Emp();
        emp2.setE_id(3243);
        emp2.setName("Pankaj Kashti");
        
        Emp emp3=new Emp();
        emp3.setE_id(645);
        emp3.setName("Sunil Sahare");
        
        Project p1=new Project();
        p1.setP_id(9090);
        p1.setPname("Online Exam");
        Project p2=new Project();
        p2.setP_id(5223);
        p2.setPname("ChatBot");
        
        List<Project> projectList1=new ArrayList<Project>();
        projectList1.add(p1);
        projectList1.add(p2);
        emp1.setProject(projectList1);
        
        List<Emp> emplist1=new ArrayList<Emp>();
        emplist1.add(emp2);
        emplist1.add(emp3);
        p2.setEmp(emplist1);
        
        //set animesh to p1
        
        session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(p1);
        session.save(p2);
        
        session.getTransaction().commit();
        
       //fetch\
        Emp e=new Emp();
        
        for(Project p: e.getProject()) {
        	System.out.println(e.getName()+"--"+p.getPname());
        }
        
//        Project p=new Project();
//        
//        for(Emp em: p.getEmp()) {
//        	System.out.println(em.getE_id()+"--"+em.getName());	
//        }
        
        session.close();
		
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}
