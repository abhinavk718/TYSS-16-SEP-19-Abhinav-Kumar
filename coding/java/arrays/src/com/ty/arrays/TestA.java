package com.ty.arrays;
public class TestA
{
	public static void main(String[] args)
	{
		int []a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for (int i = 0; i < a.length; i++)
		{
             System.out.print(a[i]+" ");
	    }
		System.out.println();
		for (int i : a) 
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		byte []b = {10,20,30,40,50};
		for (int i = 0; i < b.length; i++)
		{
             System.out.print(b[i]+" ");
	    }
		System.out.println();
		for (int i : b) 
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		double []d= {1.1,1.2,1.3,1.4,1.5};
		for (int i = 0; i < d.length; i++)
		{
             System.out.print(d[i]+" ");
	    }
		System.out.println();
		for (double i : d) 
		{
			System.out.print(i+" ");
			
		}
		
	}
}
