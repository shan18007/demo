package com.hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp 
{
    public static void main( String[] args )
    {
        try {
        
       //fetch
        Emp e=new Emp();
        
        for(Project p: e.getProject()) {
        	System.out.println(p.getPname());
        }
        
//        Project p=new Project();
//        
//        for(Emp em: p.getEmp()) {
//        	System.out.println(em.getE_id()+"--"+em.getName());	
//        }
        
		
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}
