package com.ty.exception.first;

public class TestC 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		int []a= {10,20,30};
		int b=0;
		try
		{
			System.out.println(a[4]);
			System.out.println(b/2);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("number is devided by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index not present");
		}
		System.out.println(b);
		System.out.println("main ended");
		
	} 
}
