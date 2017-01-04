package com.hostelmanagement.service;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.Part;

import com.hostelmanagement.model.Register;

public class RegisterService {

	public RegisterService() {
		// TODO Auto-generated constructor stub
	}

	public void insertNewRegister(String firstName, String lastName, String email, String pwd, String city,
			long mobileNum, Date joiningDate, int roomNum, float advancepaid) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Register newRegister = new Register();
		newRegister.setFirstName(firstName);
		newRegister.setLastName(lastName);
		newRegister.setPwd(pwd);
		newRegister.setCity(city);
		newRegister.setEmail(email);
		/*
		 * newRegister.setIdProof(idProof);
		 */ newRegister.setMobileNum(mobileNum);
		newRegister.setRoomNumber(roomNum);
		newRegister.setAdvancePaid(advancepaid);
		newRegister.setJoiningDate(joiningDate);

		entitymanager.persist(newRegister);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

	}
}
