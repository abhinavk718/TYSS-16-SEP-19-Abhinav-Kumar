package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF
{
	public static void main(String[] args) 
	{
		TreeSet<String>ts=new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		System.out.println("==========using for each loop==========");
		for (Object object : ts) 
		{
			System.out.println(object);
			
		}
		System.out.println("================using iterator========");
		Iterator it= ts.iterator();
		while (it.hasNext())
		{
			Object object = it.next();
			System.out.println(object);
		}	
	}
}
