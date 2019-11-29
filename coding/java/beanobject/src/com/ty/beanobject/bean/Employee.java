package com.ty.beanobject.bean;

public class Employee 
{
	private int id;
	private double salary;
	private String name;
	private String dept;
	private String desigination;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDesigination(String desigination)
	{
		this.desigination=desigination;
	}
	public String getDesigination()
	{
		return desigination;
	}
}
