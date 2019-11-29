package com.ty.collectionframework.list;

import java.util.ArrayList;

public class TestJ
{
	public static void main(String[] args)
	{
		ArrayList<Student>al=new ArrayList<Student>();
		Student s1=new Student(101, "Ankita", 78.5);
		Student s2=new Student(102, "Lovely", 45.5);
		Student s3=new Student(103, "Salman", 89.5);
		Student s4=new Student(104, "Shurakh",60.5);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		for (int i = 0; i <al.size(); i++) 
		{
			Student s=al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);	
		}
		System.out.println("==============for each============");
		for (Student student : al)
		{
			System.out.println(student);	
		}
	}
}
