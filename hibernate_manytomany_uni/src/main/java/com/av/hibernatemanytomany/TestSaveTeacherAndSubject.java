package com.av.hibernatemanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSaveTeacherAndSubject {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Subject s1 = new Subject();
		s1.setName("Physics");
		s1.setDuration(10);

		Subject s2 = new Subject();
		s2.setName("Chemistry");
		s2.setDuration(12);

		Subject s3 = new Subject();
		s3.setName("Mathematics");
		s3.setDuration(15);

		List<Subject> list1 = new ArrayList<Subject>();
		List<Subject> list2 = new ArrayList<Subject>();

		list1.add(s1);
		list1.add(s3);

		list2.add(s1);
		list2.add(s2);

		Teacher t1 = new Teacher();
		t1.setName("Raju");
		t1.setSalary(50000);
		t1.setSub(list1);

		Teacher t2 = new Teacher();
		t2.setName("Ramu");
		t2.setSalary(70000);
		t2.setSub(list2);

		em.getTransaction().begin();
		em.persist(t1);
		em.persist(t2);

		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.getTransaction().commit();

	}
}
