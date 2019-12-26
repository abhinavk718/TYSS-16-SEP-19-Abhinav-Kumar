package com.tyss.assetmanagement_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.assetmanagement_backend.dao.EmployeeDAO;
import com.tyss.assetmanagement_backend.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeDAO dao;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.addEmployee(bean);
	}//end of addEmployee() method
}//end of EmployeeServiceImpl
