package com.ty.beanobject.bean;

public class TestA 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setId(12);
		s.setName("shivagami");
		s.setRollNo(123);
		DataBase db=new DataBase();
		db.recive(s);
	}
}
