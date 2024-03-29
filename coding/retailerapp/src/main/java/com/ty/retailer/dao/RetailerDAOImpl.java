package com.ty.retailer.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ty.retailer.dto.OrderBean;
import com.ty.retailer.dto.ProductBean;
import com.ty.retailer.dto.RetailerBean;

@Repository
public class RetailerDAOImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;



	public int createProfile(RetailerBean Bean) {
		EntityManager entityManger=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManger.getTransaction();
		entityTransaction.begin();
		
		try {
			entityManger.persist(Bean);
			entityTransaction.commit();
			return Bean.getRid();

		}catch(Exception e) {
			e.printStackTrace();
			return -1;

		}

		

	}

	public RetailerBean login(int rid, String password) {
		EntityManager entityManager=factory.createEntityManager();
		String jpql="from RetailerBean where rid=:id and password=:pass";
		TypedQuery<RetailerBean> query=entityManager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", rid);
		query.setParameter("pass", password);
		try {
			RetailerBean bean=query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public ProductBean searchProduct(int pid) {
		EntityManager entityManager=factory.createEntityManager();
		ProductBean bean=entityManager.find(ProductBean.class, pid);
		return bean;

	}

	public boolean updatePassword(int rid, String password) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		RetailerBean bean=entityManager.find(RetailerBean.class,rid);
		bean.setPassword(password);
		entityTransaction.commit();


		return true;
	}

	public double sumAmount(int rid) {

		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		OrderBean bean=entityManager.find(OrderBean.class, rid);
		return bean.getAmountpay();
	}

	public OrderBean retrieveOrder(int rid) {
		EntityManager entityManager=factory.createEntityManager();
		List<OrderBean> l=(List<OrderBean>) entityManager.find(OrderBean.class, rid);
		OrderBean bean=new OrderBean();
		for(OrderBean orderBean:l) {
			bean.setPrice(orderBean.getOid());
			bean.setPrice(orderBean.getPrice());
			bean.setQuantity(orderBean.getQuantity());
			bean.setAmountpay(orderBean.getAmountpay());
		
		}
		return bean;
	
	}




}
