package com.hostelmanagement.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hostelmanagement.model.AdminLogin;

public class AdminLoginService {
	public boolean checkUserCredentials(long mobile, String password ) {
		boolean b=false;
		// TODO Auto-generated method stub
	
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		
		AdminLogin l=entitymanager.find( AdminLogin.class,mobile);
		
		if(l!=null){		
	      if(l.getPassword().equals(password)){
	    	  
	    	 b=true;
	    	  
	      }
         else{
	    	  
	    	  b=false;
	      }
		}
	      
	     System.out.println("Admin");

	      
		/*if (list.isEmpty() != true ) {
			entitymanager.persist(register);
			entitymanager.getTransaction().commit();
			check = 1;
		
		}*/
		entitymanager.close();
		emfactory.close();

		return b;
	}

}
