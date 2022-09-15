package com.av.hibernateonetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetAllMobileAndSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();

		Query query =  em.createQuery("select m from Mobile m");

		List<Mobile> list = query.getResultList();

		for (Mobile mobile : list) {
			System.out.println("Mobile id    :  " + mobile.getId());
			System.out.println("Mobile Name  :  " + mobile.getName());
			System.out.println("Mobile Brand :  " + mobile.getBrand());
			System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
			System.out.println();

			List<Sim> list1 = mobile.getList();

			for (Sim s : list1) {
				System.out.println("Sim Id   :  " + s.getId());
				System.out.println("Sim sp   :  " + s.getSp());
				System.out.println("Sim type :  " + s.getType());
				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				System.out.println();
			}
		}

	}
}
