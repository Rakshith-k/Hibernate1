package com.av.hibernatemanytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSaveMobileAndSim {
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.setName("POCO");
		m1.setBrand("MI");
		
		Sim s1 = new Sim();
		s1.setSp("jio");
		s1.setType("4G");

		s1.setM(m1);
		
		Sim s2 = new Sim();
		s2.setSp("BSNL");
		s2.setType("3G");
		
		s2.setM(m1);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();
		// EntityTransaction et=em.getTransaction();

		em.getTransaction().begin();
		em.persist(s1);
		em.persist(s2);

		em.persist(m1);
		em.getTransaction().commit();

	}
}

