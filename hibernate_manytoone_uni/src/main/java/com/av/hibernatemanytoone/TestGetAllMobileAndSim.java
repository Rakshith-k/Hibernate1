package com.av.hibernatemanytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllMobileAndSim {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
			EntityManager em = emf.createEntityManager();

			Query query =  em.createQuery("select s from Sim s");

			List<Sim> list = query.getResultList();

			for (Sim s : list) {
				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				System.out.println("Sim id    :  " + s.getId());
				System.out.println("Sim Name  :  " + s.getSp());
				System.out.println("Sim Brand :  " + s.getType());
				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				System.out.println();


				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				System.out.println("MobileID            :   " + s.getM().getId());
				System.out.println("MobileBrand         :   " + s.getM().getBrand());
				System.out.println("MobileName          :   " + s.getM().getName());
				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				}
			}

		}



