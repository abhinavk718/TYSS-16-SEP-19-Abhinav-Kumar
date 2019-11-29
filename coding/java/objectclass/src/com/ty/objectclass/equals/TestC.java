package com.ty.objectclass.equals;

public class TestC 
{
	public static void main(String[] args)
	{
		Cow c=new Cow(1,"ganga",1000);
		Cow c1=new Cow(2,"gori",36700);
		Cow c2=new Cow(3,"ganga",1000);
		Cow c3=c2;
		
		/*System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());*/
		
		boolean isEqual=c.equals(c1);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(isEqual);
		
	}

}
