package com.ty.beanobject.bean;

public class DataBase1
{
	void save(Employee e)
	{
		System.out.println("Id is "+e.getId());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Name is "+e.getName());
		System.out.println("Dept is "+e.getDept());
		System.out.println("Desigination is "+e.getDesigination());
	}
}
