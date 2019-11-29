package com.ty.objectclass.tostring;

public class TestA 
{
	public static void main(String[] args)
	{
		Student s=new Student(10,"Abhinav kumar",71.4);
		int hash=s.hashCode();
		System.out.println("HashCode is "+hash);
		System.out.println(s);
				
		
	}

}
