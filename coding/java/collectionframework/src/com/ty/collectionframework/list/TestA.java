package com.ty.collectionframework.list;
import java.util.ArrayList;
public class TestA
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(22.5);
		al.add("chinu");
		al.add(null);
		al.add('a');
		Object o=al.get(2);
		System.out.println(o);
		System.out.println("----------------------");
		for (int i = 0; i <5; i++) 
		{
			Object obj=al.get(i);
			System.out.println(obj);	
		}
	}
}
