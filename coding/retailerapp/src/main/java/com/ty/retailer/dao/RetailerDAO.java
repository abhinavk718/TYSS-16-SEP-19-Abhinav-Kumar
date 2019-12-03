package com.ty.retailer.dao;

import com.ty.retailer.dto.OrderBean;
import com.ty.retailer.dto.ProductBean;
import com.ty.retailer.dto.RetailerBean;

public interface RetailerDAO {

	public int createProfile(RetailerBean Bean);
	public RetailerBean login(int rid,String password);
	public ProductBean searchProduct(int pid);
	public boolean updatePassword(int rid,String password);
	public double sumAmount(int rid);
	public OrderBean retrieveOrder(int rid);

}
