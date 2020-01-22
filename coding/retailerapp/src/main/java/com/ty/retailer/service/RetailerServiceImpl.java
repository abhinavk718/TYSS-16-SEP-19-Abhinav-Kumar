package com.ty.retailer.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ty.retailer.dao.RetailerDAO;
import com.ty.retailer.dto.OrderBean;
import com.ty.retailer.dto.ProductBean;
import com.ty.retailer.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {
	
	@Autowired
	private RetailerDAO dao;

	@Override
	public int createProfile(RetailerBean Bean) {
		return dao.createProfile(Bean);
	}

	@Override
	public RetailerBean login(int rid, String password) {
		return dao.login(rid, password);
	}

	@Override
	public ProductBean searchProduct(int pid) {
		return dao.searchProduct(pid);
	}

	@Override
	public boolean updatePassword(int rid, String password) {
		
		return dao.updatePassword(rid, password);
	}

	@Override
	public double sumAmount(int rid) {
	
		return dao.sumAmount(rid);
	}

	@Override
	public OrderBean retrieveOrder(int rid) {
		return retrieveOrder(rid);
		
		}

	
	




}