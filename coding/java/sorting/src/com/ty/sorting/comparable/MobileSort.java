package com.ty.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MobileSort 
{
	public static void main(String[] args)
	{
		ArrayList<Mobile>al=new ArrayList<Mobile>();
		Mobile m1=new Mobile("Moto", 10000, 15);
		Mobile m2=new Mobile("Nokia", 8965, 20);
		Mobile m3=new Mobile("Oneplus", 35000, 60);
		Mobile m4=new Mobile("Redmi", 7200, 28);
		Mobile m5=new Mobile("Samsung", 10999, 13);
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		System.out.println("++++++++++++Before sortiing++++++++++++++++++");
		printMobileDetails(al);
		Collections.sort(al);
		System.out.println("========================After sorting=================");
		printMobileDetails(al);
	}
	public static void printMobileDetails(ArrayList<Mobile>al)
	{
		Iterator<Mobile>it=al.iterator();
	    while (it.hasNext()) 
		{
				Mobile m =it.next();
				System.out.println("Brand is "+m.brand);
				System.out.println("Price is "+m.price);
				System.out.println("Camera is "+m.camera+"mp");
				System.out.println("------------------------------");	
		}
	}	
}
