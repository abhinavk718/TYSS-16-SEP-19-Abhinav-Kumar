package com.ty.exception.first;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		Paytm p=new Paytm();
		try
		{
		    p.book();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception caught in main");
		}
		finally 
		{
			System.out.println("Finally get executed");
		}
		System.out.println("main ended");
	}

}
