package com.ty.maps;

import java.util.Hashtable;

public class TestG 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String>ht = new Hashtable<>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "sonu");
		ht.put(99, "monu");
		ht.put(101, "sriram");
		//ht.put(null, "jhon"); nullpointer exception
		//ht.put(108, null);    nullpointer exception  
		System.out.println("Data"+ht);
	}

}
