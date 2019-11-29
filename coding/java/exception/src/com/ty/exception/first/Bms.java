package com.ty.exception.first;

public class Bms
{
	public static void main(String[] args)
	{
		System.out.println("bms started");
		Pvr p=new Pvr();
		try
		{
			p.book();
			System.out.println("booking confirmed");
		}
		catch (ArithmeticException e)
		{
			System.out.println("booking failed");
		}
		System.out.println("bms ended");
	}
}
