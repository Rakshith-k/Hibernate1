package com.av.hibernate_onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeletePersonAndAadhaar {
	
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
			EntityManager em = emf.createEntityManager();
			
			Person p1=em.find(Person.class, 1);
			
			Aadhaar a1=p1.getAadhaar();
			
			em.getTransaction().begin();
			em.remove(p1);
			em.remove(a1);
			em.getTransaction().commit();
			
			
		}
	}
