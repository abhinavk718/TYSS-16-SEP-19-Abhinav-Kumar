package com.ty.abstraction;

public class Sbi implements Atm
{

	@Override
	public void validateCard()
	{
		System.out.println("Sbi validate card");
	}

	@Override
	public void getInfo()
	{
		System.out.println("Sbi card info ");
		
	}

}
