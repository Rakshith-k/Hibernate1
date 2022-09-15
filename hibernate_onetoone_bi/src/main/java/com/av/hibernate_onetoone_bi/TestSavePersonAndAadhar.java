package com.av.hibernate_onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSavePersonAndAadhar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Person p = new Person();
		p.setName("Rakshith");
		p.setAge(22);

		Aadhaar a = new Aadhaar();
		a.setFatherName("Ramu");
		a.setAadhaarNo("4596 2587 2135");

		a.setP(p);
		p.setAadhaar(a);

		em.getTransaction().begin();
		em.persist(p);
		em.persist(a);
		em.getTransaction().commit();
	}
}
