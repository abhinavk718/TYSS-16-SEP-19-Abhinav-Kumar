package com.tyss.phone_simulator_application.phoneapp;

import java.util.List;
import java.util.Scanner;

import com.tyss.phone_simulator_application.DAO.PhoneDAO;
import com.tyss.phone_simulator_application.employeeDTO.ContactBean;
import com.tyss.phone_simulator_application.util.PhoneControl;

public class PhoneApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 to show all contacts.");
		System.out.println("Press 2 to Serach for contacts(using name).");
		System.out.println("Press 3 to Operate on Contact.");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch (ch)
		{
		    case 1:
		    	PhoneDAO dao=PhoneControl.getPhoneDao();
			     List<ContactBean> result=dao.showAllContacts();
			    	for (ContactBean bean : result) 
			    	{
			    		System.out.println("Name is "+bean.getName());
			    		System.out.println("Number is "+bean.getNumber());
			    		System.out.println("Group_Name is "+bean.getGroup_Name() );
			    		System.out.println("*******************************************");
			    	}
			break;
			
            case 2:
            	PhoneDAO dao2=PhoneControl.getPhoneDao();
		    	System.out.println("Enter contact name??");
		    	String name=sc.next();
		    	ContactBean bean=dao2.searchContactByName(name);
		    	if(bean!=null)
		    	{
		    		System.out.println("Name is "+bean.getName());
		    		System.out.println("Number is "+bean.getNumber());
		    		System.out.println("Group_Name is "+bean.getGroup_Name());
		    	}
		    	else
		    	{
		    		System.out.println("No Records Found.");
		    	}
		    	System.out.println("Enter 1 to call.");
		    	System.out.println("Enter 2 to Message.");
		    	System.out.println("Enter 3 get back to main menu.");
		    	int n=sc.nextInt();
		    	if(n==1)
		    	{
		    		System.out.println("Calling the contact      "+"end call");
		    	}
		    	else if(n==2)
		    	{
		    		System.out.println("Type message here.....");
		    		String msg=sc.next();
		    		System.out.println("Sending message.....");
		    	}
		    	else if(n==3)
		    	{
		    		PhoneDAO phone=PhoneControl.getPhoneDao();
		    		phone.mainmanu();
		    	}
			break;
			
            case 3:
            	System.out.println("Enter 1 to add contact.");
		    	System.out.println("Enter 2 to delete contact.");
		    	System.out.println("Enter 3 to edit contact.");
		    	int s4=sc.nextInt();
		    	if(s4==1)
		    	{
		    		PhoneDAO dao3=PhoneControl.getPhoneDao();
			    	ContactBean bean3=new ContactBean();
			    	System.out.println("Enter name to add in contact list.");
			    	String name1=sc.next();
			    	bean3.setName(name1);
			    	System.out.println("Enter number to add in contact list.");
			    	int number=sc.nextInt();
			    	bean3.setNumber(number);
			    	System.out.println("Enter Group_name to add in contact list.");
		    		String groupname=sc.next();
		    		bean3.setGroup_Name(groupname);
		    		 
		    		int count1=dao3.add(bean3);
		    		System.out.println(count1+"rows Inserted ");
		    	}
		    	else if(s4==2)
		    	{
		    		PhoneDAO dao4=PhoneControl.getPhoneDao();
		    		System.out.println("Enter the name to delete contact??");
		    		String name4=sc.next();
		    		int count4=dao4.delete(name4);
		    		System.out.println(count4+" rows are deleted");
		    		
		    	}
		    	else if(s4==3)
		    	{
		    		PhoneDAO dao5=PhoneControl.getPhoneDao();
		    		ContactBean bean5=new ContactBean();
		    		System.out.println("Enter name");
		    		String name1=sc.next();
			    	bean5.setName(name1);
			    	System.out.println("Enter number");
			    	int number=sc.nextInt();
			    	bean5.setNumber(number);
			    	System.out.println("Enter group_name");
		    		String groupname=sc.next();
		    		bean5.setGroup_Name(groupname);
		    		
		    		int count3=dao5.update(bean5);
		    		System.out.println(count3+" rows Updated");
		    		break;
		    	}
            	
			break;
		}
	}//end of main() method
}//end of PhoneApp
