package com.ty.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Double>ls=new LinkedHashSet<>();
		ls.add(12.3);
		ls.add(25.6);
		ls.add(1.5);
		ls.add(67.5);
		ls.add(34.8);
		System.out.println("==========using for each loop==========");
		for (Object object : ls) 
		{
			System.out.println(object);
			
		}
		System.out.println("================using iterator========");
		Iterator it= ls.iterator();
		while (it.hasNext())
		{
			Object object = it.next();
			System.out.println(object);
			
		}
		
	}

}
