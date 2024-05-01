package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Pancard;
import EntityClass.Person;

public class insert {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Person p1=new Person(1,"prince",11111);
			Pancard pan1=new Pancard(101,"Delhi","01-01-2000");
			p1.setPancard(pan1);
			pan1.setPerson(p1);
			
			
			Person p2=new Person(2,"tasneem",22222);
			Pancard pan2=new Pancard(102,"Goa","16-07-1998");
			p2.setPancard(pan2);
			pan2.setPerson(p2);
			
			
			Person p3=new Person(3,"faiz",33333);
			Pancard pan3=new Pancard(103,"Pune","25-02-2001");
			
			et.begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.persist(pan1);
			em.persist(pan2);
			em.persist(pan3);
			et.commit();
			
	
		}
}
