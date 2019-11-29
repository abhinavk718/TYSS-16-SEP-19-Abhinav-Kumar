package com.ty.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Manager
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(101, "abhinav kumar", 20000);
		Employee e2=new Employee(201, "raja kumar", 15000);
		Employee e3=new Employee(301, "abhinav kumar", 25000);
		Employee e4=new Employee(401, "Aniket raj", 10000);
		Employee e5=new Employee(501, "Pritam raj", 49000);
		Employee e6=new Employee(601, "Rahul raj ", 18000);
		Employee e7=new Employee(701, "Pranshu saurav", 45000);
		Employee e8=new Employee(801, "Amit yadav", 135000);
		Employee e9=new Employee(901, "Lovely", 89000);
		ArrayList<Employee>al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee>al1=new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee>al2=new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Employee> third = hm.get("third");
		Iterator<Employee> it=third.iterator();
		while (it.hasNext())
		{
			Employee e = (Employee) it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("----------------------------");
			
		}
	}
}
