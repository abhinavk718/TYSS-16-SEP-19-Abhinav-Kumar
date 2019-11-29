package com.ty.abstraction;

public class Test 
{
	public static void main(String[] args)
	{
		Machine m=new Machine();
		Hdfc h=new Hdfc();
	    m.slot(h);
	    Icici i=new Icici();
	    m.slot(i);
	    Sbi s=new Sbi();
	    m.slot(s);
		
	}
}
