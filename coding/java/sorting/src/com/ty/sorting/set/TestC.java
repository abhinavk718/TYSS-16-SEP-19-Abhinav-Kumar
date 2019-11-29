package com.ty.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC 
{
	public static void main(String[] args)
	{
		LinkedHashSet ls=new LinkedHashSet<>();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);
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
