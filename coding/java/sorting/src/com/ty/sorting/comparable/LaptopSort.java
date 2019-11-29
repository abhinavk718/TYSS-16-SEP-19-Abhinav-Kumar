package com.ty.sorting.comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LaptopSort
{
	public static void main(String[] args)
	{
		LinkedList<Laptop>ll=new LinkedList<>();
		Laptop l1=new Laptop(25000, "HP", 3);
		Laptop l2=new Laptop(55000, "DELL", 6);
		Laptop l3=new Laptop(15000, "LENOVO", 2);
		Laptop l4=new Laptop(42000, "ACCER", 4);
		Laptop l5=new Laptop(230000, "MAC", 8);
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(l5);
		System.out.println("++++++++++Before sorting++++++++++++++++++");
		printLaptopDetails(ll);
		Collections.sort(ll);
		System.out.println("=====================After sorting=======================");
		printLaptopDetails(ll);
	}
	static void printLaptopDetails(LinkedList<Laptop>ll)
	{
		Iterator<Laptop>it=ll.iterator();
		while (it.hasNext())
		{
			Laptop l = it.next();
			System.out.println("Brand is "+l.brand);
			System.out.println("RAm is "+l.ram);
			System.out.println("Price is "+l.price);
			System.out.println("---------------------------------");
			
		}
		
    }
}
