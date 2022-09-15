package com.av.hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestGetTeacherAndSubject {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
	EntityManager em=emf.createEntityManager();
	
	Teacher t1=em.find(Teacher.class, 2);
	
	if(t1!=null)
	{
		System.out.println("Teacher id     :  "+t1.getId());
		System.out.println("Teacher name   :  " +t1.getName());
		System.out.println("Teacher salary :  "+t1.getSalary());
		
		List<Subject> s=t1.getSub();
		for(Subject t11 : s)
		{
			System.out.println("Subject id       :  "+t11.getId());
			System.out.println("Subject name     :  "+t11.getName());
			System.out.println("Subject duration :  "+t11.getDuration());
		}
	}
}
}
