package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD 
{
	public static void main() 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("Forward------------------->");
		while (li.hasNext())
		{
			Object obj = li.next();
			System.out.println(obj);
		}	
		System.out.println("Backward<-------------");
		while (li.hasPrevious())
		{
			Object o = li.previous();
			System.out.println(o);
		}	
	}
}
