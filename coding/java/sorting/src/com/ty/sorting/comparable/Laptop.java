package com.ty.sorting.comparable;

public class Laptop implements Comparable<Laptop>
{
	double price;
	String brand;
	int ram;
	public Laptop(double price, String brand, int ram) 
	{
		super();
		this.price = price;
		this.brand = brand;
		this.ram = ram;
	}
	@Override
	public int compareTo(Laptop o)
	{
		if(this.price>o.price)
		{
			return 1;
		}
		else if(this.price<o.price)
		{
			return -1;
		} 
		return 0;
	}

}
