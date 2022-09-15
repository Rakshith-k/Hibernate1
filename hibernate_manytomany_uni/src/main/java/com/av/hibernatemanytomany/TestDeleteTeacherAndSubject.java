package com.av.hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeleteTeacherAndSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();
		
		Teacher t1=em.find(Teacher.class, 1);
		
		em.getTransaction().begin();
		em.remove(t1);
		em.getTransaction().commit();
	}
}
