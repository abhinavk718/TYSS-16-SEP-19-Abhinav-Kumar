package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(20);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);		
		al.add(24);
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer>it=l.iterator();
		System.out.println("After sorting data");
		while (it.hasNext())
		{
			Integer i = (Integer) it.next();
			
			System.out.println(i);
			
		}
		
	}
}
