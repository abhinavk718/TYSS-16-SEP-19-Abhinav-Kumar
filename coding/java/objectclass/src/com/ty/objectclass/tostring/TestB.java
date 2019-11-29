package com.ty.objectclass.tostring;

public class TestB
{
	public static void main(String[] args)
	{
		Car c=new Car(5000,"BMW","Black");
		int hash=c.hashCode();
		System.out.println("HashCode is "+hash);
		System.out.println(c);
		
	}

}
