package com.av.hibernate_onetoone_bi;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class TestUpdatePersonAndAadhar {

		public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
			EntityManager em=emf.createEntityManager();
			
			Person p1=em.find(Person.class,1);
			p1.setAge(29);
			p1.setName("Lenovo");
			
			Aadhaar a1=em.find(Aadhaar.class,1);
			a1.setFatherName("Anamika");
			a1.setAadhaarNo("5458 0201 6578");
			
			em.getTransaction().begin();
			em.merge(p1);
			em.merge(a1);
			em.getTransaction().commit();

		}

	}


