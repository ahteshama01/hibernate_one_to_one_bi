package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Pancard1;
import EntityClass.Person1;

public class Update1 {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			
			Person1 p=new Person1(3,"saif",333);
			Pancard1 pan1=new Pancard1(103,"Delhi","10-11-2000");
			
			p.setPancard(pan1);
			
			et.begin();
			em.persist(p);
			em.persist(pan1);
			em.merge(p);
			et.commit();
		}
}
