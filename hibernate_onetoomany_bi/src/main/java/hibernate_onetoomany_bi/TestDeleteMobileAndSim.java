package hibernate_onetoomany_bi;

	import javax.persistence.EntityManager;
	import java.util.*;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class TestDeleteMobileAndSim {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("rakshith");
			EntityManager em = emf.createEntityManager();
		
			Mobile m=em.find(Mobile.class, 2);
			
			List<Sim> list1 = m.getList();
			
			em.getTransaction().begin();
			
			for(Sim s: list1) {
				em.remove(s);
			}
			em.remove(m);
			
			em.getTransaction().commit();
			
			System.out.println("Successfully deleted");
		}
	}

	
