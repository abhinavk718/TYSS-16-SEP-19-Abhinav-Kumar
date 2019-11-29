package com.ty.stringclass;

public class Test
{
	public static void main(String[] args)
	{
		String s1="aishu";
		System.out.println("Test.main()");
		String s2="deepika";
		
		String s3=new String("aishu");
		String s4=new String("aishu");
		String s5="aishu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
	}
}
