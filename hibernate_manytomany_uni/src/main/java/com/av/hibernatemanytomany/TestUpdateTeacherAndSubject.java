package com.av.hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateTeacherAndSubject {

		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
			EntityManager em=emf.createEntityManager();
			
			Teacher t=em.find(Teacher.class,1);
			t.setName("Varshith");
			t.setSalary(78945);
			
			
			Subject s=em.find(Subject.class,2);
			s.setName("Java");
			s.setDuration(20);
			
			em.getTransaction().begin();
			em.merge(t);
			em.merge(s);
			em.getTransaction().commit();	
		}
}
