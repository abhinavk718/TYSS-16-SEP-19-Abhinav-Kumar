package com.ty.primitivetypecasting.refrence;

public class TestA 
{
     public static void main(String[] args)
     {
    	 Pen p=new Marker();//upcasting
    	 System.out.println(p.cost);
    	 p.write();
    	 Marker m=(Marker)p;//downcasting
    	 m.color();
    	 m.write();
	}
}