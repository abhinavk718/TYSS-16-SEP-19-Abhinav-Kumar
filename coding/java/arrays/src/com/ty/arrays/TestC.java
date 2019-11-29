package com.ty.arrays;

public class TestC
{
	public static void main(String[] args) 
	{
		Student s=new Student(1,"arya",78.35);
		Student s1=new Student(2,"chandan",98.35);
		Student s2=new Student(3,"raja",90.35);
		
		Student []st=new Student[3];
		st[0]=s;
		st[1]=s1;
		st[2]=s2;
		
		for (Student stu : st)
		{
			System.out.println(stu);
		}
	}

}
