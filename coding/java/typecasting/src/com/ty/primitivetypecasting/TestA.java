package com.ty.primitivetypecasting;

public class TestA 
{
	public static void main(String[] args)
	{
		byte a=10;
		int b=a;//implicit casting
		System.out.println("b is "+b);
		int p=20;
		double q=p;
		System.out.println("q is "+q);
		System.out.println("*******************************");
		double x=20.67;
		int y=(int)x;//explicit casting
		System.out.println("y is "+y);
		byte z=(byte)x;
		System.out.println("z is "+z);
		char c=(char)x;
		System.out.println("c is "+c );
	}
}
