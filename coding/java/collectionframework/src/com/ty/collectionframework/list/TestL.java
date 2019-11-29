package com.ty.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l= new LinkedList<>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		//l.add(null); dont pass null in sort() method and non-generic
		System.out.println("Before sort "+l);
		Collections.sort(l);
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reversing"+l);
		
		Collections.shuffle(l);
		System.out.println("After suffle() method"+l);
	}
}
