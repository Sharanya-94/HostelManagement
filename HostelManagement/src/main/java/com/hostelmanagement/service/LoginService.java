package com.hostelmanagement.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hostelmanagement.model.Register;
import com.hostelmanagement.service.LoginService;

public class LoginService {

	public LoginService() {
		// TODO Auto-generated constructor stub
	}

	public List<Register> checkUserCredentials(long mobile, String password) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		/*
		 * Register register = entitymanager.find(Register.class, mobileNum);
		 * 
		 */
		Query query = entitymanager.createQuery(
				"select firstName,lastName,email,mobileNum,city,joiningDate,roomNumber, advancePaid from Register r where r.mobileNum = :mobile1 and r.pwd = :password1 ");
		query.setParameter("mobile1", mobile);
		query.setParameter("password1", password);

		List<Register> list = query.getResultList();

		/*
		 * if (list.isEmpty() != true ) { entitymanager.persist(register);
		 * entitymanager.getTransaction().commit(); check = 1;
		 * 
		 * }
		 */
		entitymanager.close();
		emfactory.close();

		return list;
	}

	public List<Register> getUserDetails(long mobileNum) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myapp");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		/*
		 * Register register = entitymanager.find(Register.class, mobileNum);
		 * 
		 */
		Query query = entitymanager.createQuery(
				"select firstName,lastName,email,mobileNum,city,joiningDate,roomNumber, advancePaid from Register r where r.mobileNum = :mobNum");
		query.setParameter("mobNum", mobileNum);
		

		List<Register> list = query.getResultList();

		/*
		 * if (list.isEmpty() != true ) { entitymanager.persist(register);
		 * entitymanager.getTransaction().commit(); check = 1;
		 * 
		 * }
		 */
		entitymanager.close();
		emfactory.close();

		return list;
	}

}
