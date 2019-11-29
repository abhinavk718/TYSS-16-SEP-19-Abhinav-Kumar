package com.ty.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB 
{
	public static void main(String[] args) 
	{
		HashSet<String>hs=new HashSet<>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("drijay");
		hs.add("enjoy");
		System.out.println("===========using foreach loop");
		for (String string : hs)
		{
			System.out.println(string);
			
		}
		System.out.println("**************using iterator*************");
		Iterator<String>it=hs.iterator();
		while (it.hasNext())
		{
			String string = it.next();
			System.out.println(string);
			
		}
		
	}

}
