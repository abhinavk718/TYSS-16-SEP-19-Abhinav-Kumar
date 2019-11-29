package com.ty.accessmodifier.pkg2;

public class Run 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		//private
		/*System.out.println(d.a1);
		d.add();*/
		
		//Default
		System.out.println(d.b);
		d.sub();
		
		//protected
		System.out.println(d.c);
		d.mul();
		
		//public
		System.out.println(d.name);
		d.div();
		
	}

}
