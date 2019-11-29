package com.ty.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE
{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet<>();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		// null not allowed in treeset
		//ts.add(null); nullpointerexception
		//ts.add("deepika");  classcastexception
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
