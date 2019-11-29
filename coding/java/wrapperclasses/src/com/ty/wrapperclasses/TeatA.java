package com.ty.wrapperclasses;

public class TeatA
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("a is "+a);
		Integer i=a;  //autoboxing
		System.out.println("i ia "+i);
		
		Integer x=10;
		System.out.println("x is "+x);
		//Integer z= new Integer(20);
		int y=x;    //autounboxing
		System.out.println("y is "+y );
		
		
		int value=Integer.parseInt("123");
		System.out.println("value is "+value);
		
	}
	

}
