package com.tyss.springmvcassesment.dao;

import com.tyss.springmvcassesment.dto.Retailer;

public interface RetailerDAO 
{
	 public Retailer createProfile(Retailer register);
	 public Retailer login(int id,String password);
     public Retailer searchProduct(int id);
     public boolean updatePassword(Retailer register);
     public int calculateAmmount();
     public int retriveOrder(int id);
}