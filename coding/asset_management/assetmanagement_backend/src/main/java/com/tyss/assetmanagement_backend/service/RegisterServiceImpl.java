package com.tyss.assetmanagement_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.assetmanagement_backend.dao.RegisterDAO;
import com.tyss.assetmanagement_backend.dto.Registration;

@Service
public class RegisterServiceImpl implements RegisterService
{
	@Autowired
	private RegisterDAO dao;

	@Override
	public boolean register(Registration register)
	{
		return dao.register(register);
	}

	@Override
	public boolean login(String email, String password) {
		
		return dao.login(email, password);
	}
}
