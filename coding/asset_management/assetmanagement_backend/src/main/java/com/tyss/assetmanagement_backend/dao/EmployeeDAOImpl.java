package com.tyss.assetmanagement_backend.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;


import org.springframework.stereotype.Repository;

import com.tyss.assetmanagement_backend.dto.EmployeeBean;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(EmployeeBean bean) 
	{
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		try 
		{
			transection.begin();
			manager.persist(bean);
			transection.commit();
			return true;
		} catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}//end of addEmployee  method
}//end of EmployeeDAOImpl
