package com.ty.exception.customcheckedexception;

public class TestAmount
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		
		ValidateAmount va=new ValidateAmount();
		try
		{
			va.checkAmount(200000);
		}
		catch (InvalidAmountException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main ended");

	}

}
