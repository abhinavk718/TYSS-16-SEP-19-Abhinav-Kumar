package com.tyss.assetmanagement_backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.assetmanagement_backend.dto.Registration;

@Repository
public class RegisterDAOImpl implements RegisterDAO
{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean register(Registration register)
	{
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		try 
		{
			transection.begin();
			manager.persist(register);
			transection.commit();
			return true;
		} catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}//end of register() method

	@Override
	public boolean login(String email, String password) {
		String jpql="from Registration where email=:email and password=:password";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Registration> query=manager.createQuery(jpql,Registration.class);
		
		query.setParameter("email", email);
		query.setParameter("password",password);
		try {
			Registration register=query.getSingleResult();
			if(register!=null) {
				return true	;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}//end of RegisterDAOImpl
