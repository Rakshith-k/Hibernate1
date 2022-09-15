package com.av.hibernatemanytomany;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAllTeacherAndSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("Select t from Teacher t");

		List<Teacher> t1 = query.getResultList();

		for (Teacher t11 : t1) {
			System.out.println("(----------------)**(----------------)");
			System.out.println("Teache id      :  " + t11.getId());
			System.err.println("Teacher name   :  " + t11.getName());
			System.out.println("Teacher Salary :  " + t11.getSalary());
			System.out.println("(----------------)**(----------------)");
			System.out.println();

			List<Subject> s1 = t11.getSub();

			for (Subject s : s1) {
				System.out.println("(----------------)**(----------------)");
				System.out.println("Subject Id       : " + s.getId());
				System.out.println("Subject name     : " + s.getName());
				System.out.println("Subject duration : " + s.getDuration());
				System.out.println("(----------------)**(----------------)");
				System.out.println();
			}
		}

	}
}
