package com.ty.exception.first;

public class TestE 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		String s="hello";
		int []a= {10,20,30};
		int b=10;
		try
		{
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
			
		} 
		catch (NullPointerException e) 
		{
			System.out.println("don't play with null");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("index not present");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("divided by zero");
		}
		System.out.println("main ended");	
	}
}
