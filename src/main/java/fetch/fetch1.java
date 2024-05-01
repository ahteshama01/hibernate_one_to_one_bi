package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Pancard1;
import EntityClass.Person1;

public class fetch1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		
		Person1 p=em.find(Person1.class, 1);
		Pancard1 pan1=p.getPancard();
		System.out.println(p);
		System.out.println(pan1);
		
		Pancard1 pan2=em.find(Pancard1.class, 102);
		Person1 p1=pan2.getPerson();
		System.out.println(pan2);
		System.out.println(p1);
	}
}
