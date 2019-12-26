package com.tyss.assetmanagement_backend.dao;

import com.tyss.assetmanagement_backend.dto.Registration;

public interface RegisterDAO {
	public boolean register(Registration register);
	public boolean login(String email,String password);

}
