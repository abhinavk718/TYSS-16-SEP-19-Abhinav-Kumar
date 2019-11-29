package com.ty.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestI 
{
	public static void main(String[] args)
	{
		Vector v= new Vector<>();
		v.add(12);
		v.add(34.5);
		v.add("more");
		v.add(true);
		v.add(null);
		System.out.println("==========using for loop=========");
		for (int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));	
		}
		System.out.println("============using for each loop=========");
		for (Object object : v)
		{
			System.out.println(object);
		}
		System.out.println("========using iterator=============");
		Iterator it=v.iterator();
		while (it.hasNext())
		{
			Object object =it.next();
			System.out.println(object);
		}
		System.out.println("=========using list iterator============");
		ListIterator lit=v.listIterator();
		while (lit.hasNext())
		{
			Object object =lit.next();
			System.out.println(object);
		}
	}
}
