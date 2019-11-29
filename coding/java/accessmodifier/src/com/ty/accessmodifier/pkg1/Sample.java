package com.ty.accessmodifier.pkg1;

import com.ty.accessmodifier.pkg2.Demo;

public class Sample extends Demo
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		//private
	/*  System.out.println(d.a1);
		d.add();
		
		*/
		
		//Default
		Sample s=new Sample();
		/*System.out.println(s.b);
		s.sub();*/ 
		
		//protected
		System.out.println(s.c);
		s.mul();
		
		//public
		System.out.println(d.name);
		d.div();
		
	}

}
