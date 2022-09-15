package com.av.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Aadhaar;
import com.av.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rakshith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void savePerson(Person p) {

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

	public void getPersonById(int id) {
		Person person = entityManager.find(Person.class, id);// find() -- fetch the date based on primary key
		System.out.println();
		System.out.println("------------GetById------------");
		if (person != null) {
			System.out.println("Person ID     : " + person.getId());
			System.out.println("Person Name   : " + person.getName());
			System.out.println("Person Age    : " + person.getAge());
			System.out.println("Aadhaar No    : " + person.getAadhaar().getAadhaarNo());
			System.out.println("Father Name   : " + person.getAadhaar().getFatherName());
			System.out.println("-------------------------------");
		}
	}

	public void deletePerson(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person p = entityManager.find(Person.class, id);
		int aadhaarId = p.getAadhaar().getId();

		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
		AadhaarDao aadhaarDao = new AadhaarDao();
		aadhaarDao.deleteAadhaar(aadhaarId);
	}

	public void updatePersonById(int id, Person person, Aadhaar aadhaar) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person1 = entityManager.find(Person.class, id);
		
		entityTransaction.begin();
		person1.setName(person.getName());
		person1.setAge(person.getAge());
		entityTransaction.commit();
		
		AadhaarDao aadharDao = new AadhaarDao();
		aadharDao.updateAadhaarById(person1.getAadhaar().getId(), aadhaar);

	}

}