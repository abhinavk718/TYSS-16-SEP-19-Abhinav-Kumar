package com.empwebapp.util;

import com.empwebapp.dao.EmployeeDAO;
import com.empwebapp.dao.EmployeeDaojdbcImpl;

public class EmployeeDaoManager
{
	private EmployeeDaoManager()
	{
		
	}
	public static EmployeeDAO getEmployeeDAO()
	{
		return new EmployeeDaojdbcImpl();
	}
}//end of EmployeeDaoManager
