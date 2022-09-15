package com.av.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class TestGetMobileAndSim {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
	EntityManager em = emf.createEntityManager();
	
	Mobile m=em.find(Mobile.class, 1);
	
	if(m!=null)
	{
		System.out.println("Mobile id    :  "+m.getId());
		System.out.println("Mobile Name  :  "+m.getName());
		System.out.println("Mobile Brand :  "+m.getBrand());
		System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println();
		
		List<Sim> list = m.getList();
		
		for(Sim s : list) {
			System.out.println("Sim Id   :  "+s.getId());
			System.out.println("Sim sp   :  "+s.getSp());
			System.out.println("Sim type :  "+s.getType());
			System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
			System.out.println();
		}
	}
}
}
