package com.av.hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeleteMobileAndSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Sim s= em.find(Sim.class, 1);

		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();

		System.out.println("Successfully deleted");
	}
}
