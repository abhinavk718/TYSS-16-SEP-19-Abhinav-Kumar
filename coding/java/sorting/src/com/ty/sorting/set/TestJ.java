package com.ty.sorting.set;

import java.util.Iterator;
import java.util.*;

public class TestJ
{
	public static void main(String[] args)
	{
		ShortName sn=new ShortName();
		TreeSet<Customer> hs  = new TreeSet<>();
				Customer c2=new Customer("Raja", 6565, 300000);
		Customer c3=new Customer("Himanshu", 8989, 15000);
		Customer c4=new Customer("Aniket", 4512, 10000);
		Customer c5=new Customer("Rahul", 4578, 250000);
		hs.add(c2);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		System.out.println("==================using iterator=================");
		Iterator<Customer>it=hs.iterator();
		while (it.hasNext()) 
		{
			Customer c=it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Name is "+c.salary);
			System.out.println("-----------------------------");
		}
	}
}
