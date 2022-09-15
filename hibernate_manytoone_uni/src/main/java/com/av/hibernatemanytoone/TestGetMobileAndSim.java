package com.av.hibernatemanytoone;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
public class TestGetMobileAndSim {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
		EntityManager em = emf.createEntityManager();
		
		Sim s=em.find(Sim.class, 1);
		
		if(s!=null)
		{
			System.out.println("Sim id    :  "+s.getId());
			System.out.println("Sim sp  :  "+s.getSp());
			System.out.println("Sim type :  "+s.getType());
			System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
			System.out.println();
			
			Query query = em.createQuery("select m from Mobile m");
			
			List<Mobile> list = query.getResultList();
			
			for(Mobile m : list) {
				System.out.println("Mobile id   :  "+m.getId());
				System.out.println("Mobile name  :  "+m.getName());
				System.out.println("Mobile brand :  "+m.getBrand());
				System.out.println("*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
				System.out.println();
			}
		}
	}
}


