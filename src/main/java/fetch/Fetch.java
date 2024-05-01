package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EntityClass.Pancard;
import EntityClass.Person;

public class Fetch {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
			EntityManager em=emf.createEntityManager();
			
			Person p1=em.find(Person.class, 1);
			Pancard pan=p1.getPancard();
			System.out.println(p1);
			System.out.println(pan);
			
			Pancard pan1=em.find(Pancard.class, 102);
			Person p2=pan1.getPerson();
			System.out.println(pan1);
			System.out.println(p2);
			
		}
}
