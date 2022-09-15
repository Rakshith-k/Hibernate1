package com.av.hibernateonetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;;

public class TestSaveMobileAndSim {

	public static void main(String[] args) {
		Sim s1 = new Sim();
		s1.setSp("jio");
		s1.setType("4G");

		Sim s2 = new Sim();
		s2.setSp("BSNL");
		s2.setType("3G");

		List<Sim> list = new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);

		Mobile m1 = new Mobile();
		m1.setName("POCO");
		m1.setBrand("MI");

		m1.setList(list);

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
