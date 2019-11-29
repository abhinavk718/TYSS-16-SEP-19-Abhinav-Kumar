package com.ty.arrays;
public class TestB
{
	public static void main(String[] args) 
	{
		int []nums= {10,20,30,40,50};
	//	System.out.println(nums[20]); ArrayIndexOutOfBondException
		recive(nums);
		int []values=getArray();
		for (int i = 0; i < values.length; i++) 
		{
			System.out.println(values[i]);	
		}
		String []value=getArray1();
		for (int i = 0; i < value.length; i++) 
		{
			System.out.println(value[i]);	
		}
	}
	static void recive(int [] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);	
		}	
	}
	static int[] getArray()
	{
		int []nums= {10,20,30,40,50};
		return nums;
	}
	static String[] getArray1()
	{
		String []string= {"asdd","qwrtg","dfgjh","aerhyt6j"};
		return string;
	}
}