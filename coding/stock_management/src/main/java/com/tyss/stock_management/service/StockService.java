package com.tyss.stock_management.service;

import java.util.List;

import com.tyss.stock_management.dto.Product_Info;

public interface StockService 
{
	public boolean addProduct(Product_Info product);
	public boolean modifyProduct(Product_Info product);
	public boolean deleteProductById(int id);
	public Product_Info searchProductByName(String name);
	public Product_Info searchProductByCompany(String company);
	public List<Product_Info> searchProductByCategory(String category);
	public List<Product_Info> getAllProduct();

}
