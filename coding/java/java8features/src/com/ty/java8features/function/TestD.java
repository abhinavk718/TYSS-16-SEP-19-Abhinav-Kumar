package com.ty.java8features.function;

import java.util.function.Function;

public class TestD 
{
	public static void main(String[] args) 
	{
		Function<Integer, Student>f = id ->{
			Student s= new Student(2,"vijay", 56.6);
			s.id=id;
			return s;
		};
		Student s=f.apply(27);
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percentage);
		
	}

}
