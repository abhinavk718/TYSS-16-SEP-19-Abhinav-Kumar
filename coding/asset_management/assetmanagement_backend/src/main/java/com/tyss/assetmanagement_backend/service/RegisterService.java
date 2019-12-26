package com.tyss.assetmanagement_backend.service;

import com.tyss.assetmanagement_backend.dto.Registration;

public interface RegisterService
{
    public boolean register(Registration register);
    public boolean login(String email,String password);
}
