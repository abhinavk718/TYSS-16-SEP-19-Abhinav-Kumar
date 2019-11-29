package com.ty.sorting.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class BankingSort
{
	public static void main(String[] args) 
	{
		BankingSortByName bsbn=new BankingSortByName();
		TreeSet<Banking> ts=new TreeSet<Banking>(bsbn);
		Banking b1=new Banking("sbi", 72548, 954756);
		Banking b2=new Banking("canera", 24894, 147589);
		Banking b3=new Banking("uco", 84256, 345698);
		Banking b4=new Banking("hdfc", 45698, 587456);
		Banking b5=new Banking("icici", 12378, 147259);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		Iterator<Banking>itr =ts.iterator();
		while (itr.hasNext())
		{
			Banking b = (Banking) itr.next();
			System.out.println("Name is "+b.name);
			System.out.println("IFSC is "+b.ifsc);
			System.out.println("MICR is "+b.micr);
			System.out.println("----------------------------");	
		}
	}
}
