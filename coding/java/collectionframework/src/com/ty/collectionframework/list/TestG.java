package com.ty.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG 
{
	public static void main(String[] args) 
	{
		LinkedList li=new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		System.out.println("==========using for loop=========");
		for (int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));	
		}
		System.out.println("============using for each loop=========");
		for (Object object : li)
		{
			System.out.println(object);
			
		}
		System.out.println("========using iterator=============");
		Iterator it=li.iterator();
		while (it.hasNext())
		{
			Object object =it.next();
			System.out.println(object);
		}
		System.out.println("=========using list iterator============");
		ListIterator lit=li.listIterator();
		while (lit.hasNext())
		{
			Object object =lit.next();
			System.out.println(object);
			
		}
	}
}
