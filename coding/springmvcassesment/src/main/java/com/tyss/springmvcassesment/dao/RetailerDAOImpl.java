package com.tyss.springmvcassesment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.tyss.springmvcassesment.dto.Retailer;

public class RetailerDAOImpl implements RetailerDAO
{
	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transactrion=null;

	@Override
	public Retailer createProfile(Retailer register) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(register);
			transaction.commit();
			return register;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Retailer login(int id, String password) {
		String jpql="from Retailer where id=:id and password=:pass";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Retailer>query=manager.createQuery(jpql,Retailer.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			Retailer retailer=query.getSingleResult();
			return retailer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Retailer searchProduct(int id) {
		
		EntityManager manager=factory.createEntityManager();
		return manager.find(Retailer.class,id);
	}

	@Override
	public boolean updatePassword(Retailer register) {
		
		return false;
	}

	@Override
	public int calculateAmmount() {
		
		return 0;
	}

	@Override
	public int retriveOrder(int id) {
		return 0;
	}
}