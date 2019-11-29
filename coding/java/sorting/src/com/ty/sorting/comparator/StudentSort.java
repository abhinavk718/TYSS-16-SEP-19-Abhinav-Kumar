package com.ty.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentSort 
{
	public static void main(String[] args)
	{
		ArrayList<Student>al=new ArrayList<>();
		Student s1=new Student("Abhinav Kumar", 1565, 56.6);
		Student s2=new Student("Raja Kumar", 5684, 59.6);
		Student s3=new Student("Aniket Raj", 1576, 69.5);
		Student s4=new Student("Himanshu Raj", 9247, 45.6);
		Student s5=new Student("Amit Yadav", 3146, 35.6);
		//SortByName sbn=new SortByName();
		SortById sbi=new SortById();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("Before sorting");
		studentDetails(al);
		//Collections.sort(al,sbn);
          Collections.sort(al,sbi);
		System.out.println("=============After sorting===================");
		studentDetails(al);
		
	}
	public static void studentDetails(ArrayList<Student>al)
	{
		Iterator<Student>it=al.iterator();
		while (it.hasNext())
		{
			Student s = (Student) it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------------");	
		}
	}
}
