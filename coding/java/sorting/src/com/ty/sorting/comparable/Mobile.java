package com.ty.sorting.comparable;

public class Mobile implements Comparable<Mobile>
{
	String brand;
	double price;
	int camera;
	public Mobile(String brand, double price, int camera)
	{
		super();
		this.brand = brand;
		this.price = price;
		this.camera = camera;
	}
	@Override
	public int compareTo(Mobile o) 
	{
		if(this.camera>o.camera)
		{
			return 1;
		}
		else if(this.camera<o.camera)
		{
			return -1;
		}
		return 0;
	}
}
