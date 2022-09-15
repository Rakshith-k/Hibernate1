package com.av.hibernate_onetoone_bi;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	public class TestGetAllPersonAndAadhar {

		
		public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakshith");
			EntityManager em=emf.createEntityManager();
			
			Query query=em.createQuery("select p from Person p");
			
			List<Person>list=query.getResultList();
			
			for(Person p:list)
			{
				System.out.println("!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!");
				System.out.println("Person id    :  "+p.getId());
				System.out.println("Person name  :  "+p.getName());
				System.out.println("Person age   :  "+p.getAge());
				System.out.println("!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!");
			}
			
			Query query1=em.createQuery("select a from Aadhaar a");
			
			List<Aadhaar>list2=query1.getResultList();
			
			for(Aadhaar a:list2)
			{
				System.out.println("!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!");
				System.out.println("aadhar id          :  "+a.getId());
				System.out.println("aadhar FatherName  :  "+a.getFatherName());
				System.out.println("aadhar number      :  "+a.getAadhaarNo());
				System.out.println("!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!@--@!");
			}
		}

	}


