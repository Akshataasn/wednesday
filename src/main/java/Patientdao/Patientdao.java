package Patientdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Patientdto.Patientdto;

public class Patientdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("xyz");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public void insert(Patientdto p2){
		entityTransaction.begin();
		entityManager.persist(p2);
		entityTransaction.commit();
	}
	
	public void update(String s1,String s2) {
		Patientdto p1=entityManager.find(Patientdto.class, s1);
		System.out.println(p1);
		p1.setBg(s2);
		entityTransaction.begin();
		entityManager.merge(p1);
		entityTransaction.commit();
	}
}
