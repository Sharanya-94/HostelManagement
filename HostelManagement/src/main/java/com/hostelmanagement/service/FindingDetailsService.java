package com.hostelmanagement.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hostelmanagement.model.RoomDetails;

public class FindingDetailsService {
	 public RoomDetails Availability( int value ) {
		   
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	     	      
	      RoomDetails rd = entitymanager.find( RoomDetails.class,value);
	      
	      System.out.println(rd.getSecondFloor());
	    
	 
	      
	      /*entitymanager.persist( rd );
	      entitymanager.getTransaction( ).commit( );

	     
		
	      entitymanager.getTransaction( ).begin( );
	      */
	     
	      entitymanager.close( );
	      emfactory.close( );
	      return rd;
	   }

}