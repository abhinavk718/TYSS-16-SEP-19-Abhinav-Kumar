package com.tyss.multithreading;

public class TestThread
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		
		MyThread mt=new MyThread();
		mt.start();
		 
		for (int i = 0; i <10; i++) 
		{
			System.out.println("Main thread");	
		}
		System.out.println("Main Ended");
	}//end of main
}//end of TestThread
