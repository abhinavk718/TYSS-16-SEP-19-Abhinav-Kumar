package com.ty.exception.first;

public class Paytm
{
	void book()
	{
		System.out.println("paytm started");
		
		Irctc i=new Irctc();
		i.confirmed();
		
		System.out.println("paytm ended");
	}
}
