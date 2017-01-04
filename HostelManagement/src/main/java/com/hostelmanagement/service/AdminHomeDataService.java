package com.hostelmanagement.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hostelmanagement.model.Register;

public class AdminHomeDataService {
public 	List registrationDetails(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

		
		Query query = entitymanager.
			      createQuery("select firstName,lastName,mobileNum,joiningDate,roomNumber  from Register");
				

			      List<Register> list =  query.getResultList();
		
		System.out.println(list);
		
		return list;
		
	}

}
