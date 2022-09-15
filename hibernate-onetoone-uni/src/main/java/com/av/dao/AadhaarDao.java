package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Aadhaar;
import com.av.dto.Person;

public class AadhaarDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rakshith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void saveAadhaar(Aadhaar a) {
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(a);
		entityTransaction.commit();

	}

	public void deleteAadhaar(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Aadhaar a = entityManager.find(Aadhaar.class, id);
		entityTransaction.begin();
		entityManager.remove(a);
		entityTransaction.commit();
	}

	public void updateAadhaarById(int id, Aadhaar aadhaar) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Aadhaar a = entityManager.find(Aadhaar.class, id);
		a.setFatherName(aadhaar.getFatherName());
		a.setAadhaarNo(aadhaar.getAadhaarNo());
		entityTransaction.commit();
	}

}