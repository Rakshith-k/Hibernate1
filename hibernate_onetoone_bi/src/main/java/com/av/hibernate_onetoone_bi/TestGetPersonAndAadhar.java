package com.av.hibernate_onetoone_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonAndAadhar {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
	EntityManager em = emf.createEntityManager();
	
	Person p1=em.find(Person.class, 1);
	
	if(p1!=null)
	{
		System.out.println("**--**--**--**--**--**--**--**--**--**--**--");
		System.out.println("Person id     :  "+p1.getId());
		System.out.println("Person name   :  "+p1.getName());
		System.out.println("Person age    :  "+p1.getAge());
		System.out.println("**--**--**--**--**--**--**--**--**--**--**--");
		System.out.println("Aadhar id            :  "+p1.getAadhaar().getId());
		System.out.println("Aadhar Father Name   :  "+p1.getAadhaar().getFatherName());
		System.out.println("Aadhar number        :  "+p1.getAadhaar().getAadhaarNo());
		System.out.println("**--**--**--**--**--**--**--**--**--**--**--");
	}
}
}
