package com.tyss.stock_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stock_management.dao.StockDAO;
import com.tyss.stock_management.dto.Product_Info;

@Service
public class StockServiceImpl implements StockService
{
	@Autowired
	private StockDAO dao;

	@Override
	public boolean addProduct(Product_Info product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean modifyProduct(Product_Info product) {
		
		return dao.modifyProduct(product);
	}

	@Override
	public boolean deleteProductById(int id) {
		
		return dao.deleteProductById(id);
	}

	@Override
	public Product_Info searchProductByName(String name) {
		
		return dao.searchProductByName(name);
	}

	@Override
	public Product_Info searchProductByCompany(String company) {
		
		return dao.searchProductByCompany(company);
	}

	@Override
	public List<Product_Info> searchProductByCategory(String category) {
		
		return dao.searchProductByCategory(category);
	}

	@Override
	public List<Product_Info> getAllProduct() {
		
		return dao.getAllProduct();
	}

}