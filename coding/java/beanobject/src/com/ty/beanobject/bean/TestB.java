package com.ty.beanobject.bean;

public class TestB 
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setId(1918);
		e.setName("Abhinav kumar");
		e.setSalary(1232000);
		e.setDept("development");
		e.setDesigination("software-developer");
		DataBase1 db=new DataBase1();
		db.save(e);
	}
}
