package com.ty.objectclass.tostring;

public class Car 
{
	int cost;
	String brand;
	String color;
	public Car(int cost, String brand, String color) 
	{
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public int hashCode() 
	{
		return cost;
	}
	@Override
	public String toString()
	{
		return "Brand is "+brand+" cost is "+cost+" color is "+color;
	}
}
