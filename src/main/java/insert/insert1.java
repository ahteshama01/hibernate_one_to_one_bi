package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EntityClass.Pancard1;
import EntityClass.Person1;

public class insert1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person1 p1=new Person1(1,"shubham",111);
		Pancard1 pan1=new Pancard1(101,"maharashtra","01-02-1998");
		p1.setPancard(pan1);
		
		Person1 p2=new Person1(2,"Rahul",222);
		Pancard1 pan2=new Pancard1(102,"maharashtra","01-02-1999");
		p2.setPancard(pan2);
		
		et.begin();
		em.persist(pan1);
		em.persist(p1);
		em.persist(pan2);
		em.persist(p2);
		et.commit();
		
		
	}
}
