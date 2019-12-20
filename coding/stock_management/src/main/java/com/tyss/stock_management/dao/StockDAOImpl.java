package com.tyss.stock_management.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stock_management.dto.Product_Info;

@Repository
public class StockDAOImpl implements StockDAO
{
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modifyProduct(Product_Info product) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info productInfo = manager.find(Product_Info.class, product.getId());
			productInfo.setCategory(product.getCategory());
			productInfo.setName(product.getName());
			productInfo.setQuantity(product.getQuantity());
			productInfo.setPrice(product.getPrice());
			productInfo.setCategory(product.getCategory());
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProductById(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info productInfo = manager.find(Product_Info.class, id);
			manager.remove(productInfo);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product_Info> getAllProduct() {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info";
		TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
		return typedQuery.getResultList();
	}

	@Override
	public Product_Info searchProductByName(String name) {
		
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product_Info where name=:name";
			TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
			typedQuery.setParameter("name", name);
			Product_Info productInfo = typedQuery.getSingleResult();
			return productInfo;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Product_Info searchProductByCompany(String company) {
		
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product_Info where company=:company";
			TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
			typedQuery.setParameter("company", company);
			Product_Info productInfo = typedQuery.getSingleResult();
			return productInfo;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product_Info> searchProductByCategory(String category) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where category=:category";
		TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

}
