package com.tyss.phone_simulator_application.util;

import com.tyss.phone_simulator_application.DAO.PhoneDAO;
import com.tyss.phone_simulator_application.DAO.PhoneDAOImpl;

public class PhoneControl
{
	private PhoneControl()
	{
		
	}
	public static PhoneDAO getPhoneDao()
	{
		return new PhoneDAOImpl();
	}

}
