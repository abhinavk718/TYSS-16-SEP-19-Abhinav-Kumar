package com.tyss.phone_simulator_application.DAO;

import java.util.List;

import com.tyss.phone_simulator_application.employeeDTO.ContactBean;

public interface PhoneDAO 
{
	public List<ContactBean> showAllContacts();
	public ContactBean searchContactByName(String name);
	public int add(ContactBean bean);
	public int delete(String name);
	public int update(ContactBean bean);
	public void mainmanu();
}

