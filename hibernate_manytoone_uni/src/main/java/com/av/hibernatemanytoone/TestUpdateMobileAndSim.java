package com.av.hibernatemanytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateMobileAndSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Sim s2 = em.find(Sim.class, 2);
		s2.setSp("AIRTEL");
		s2.setType("3G");

		Mobile m1 = em.find(Mobile.class, 1);
		m1.setName("SAMSUNG");
		m1.setBrand("OPPO");

		// EntityTransaction et=em.getTransaction();

		em.getTransaction().begin();
		em.merge(s2);

		em.merge(m1);
		em.getTransaction().commit();

	}
}
