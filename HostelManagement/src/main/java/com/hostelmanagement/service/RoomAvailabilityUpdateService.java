
package com.hostelmanagement.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hostelmanagement.model.RoomDetails;

public class RoomAvailabilityUpdateService {
	public void roomsUpdate(int sharing,int floor1,int floor2,int floor3 ) {
		   
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	     	      
	      RoomDetails rd = entitymanager.find( RoomDetails.class,sharing);
	          rd.setFirstFlloor(floor1);
	           rd.setSecondFloor(floor2);
	             rd.setThirdFloor(floor3);
	      entitymanager.getTransaction().commit();

	      entitymanager.close( );
	      emfactory.close( );
	   }

}
