package com.ty.exception.customexception;

public class TestAge 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		
		Validator v=new Validator();
		try
		{
		     v.verify(12);
		}
		catch (InvalidAgeException e)
		{
			System.out.println("Exception occured");
		}
		v.verify(15);
		System.out.println("main ended");
	}

}
