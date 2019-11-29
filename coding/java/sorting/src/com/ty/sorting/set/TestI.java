package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI 
{
	public static void main(String[] args) 
	{
		//SortByName sb=new SortByName();
		SortByPincode sb=new SortByPincode();
		TreeSet<Bank> ts=new TreeSet<Bank>(sb);
		Bank b1=new Bank("HDFC", 550068, 6768679);
		Bank b2=new Bank("SBI", 550071, 9898989);
		Bank b3=new Bank("CITI", 550054, 765765);
		Bank b4=new Bank("CANARA", 550056, 123456);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		System.out.println("===============using iterator======================");
		Iterator<Bank>it=ts.iterator();
		while (it.hasNext()) 
		{
			Bank b =it.next();
			System.out.println("Name is "+b.name);
			System.out.println("PINCODE is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("===============================");	
		}	
	}
}
