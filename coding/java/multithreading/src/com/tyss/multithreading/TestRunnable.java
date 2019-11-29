package com.tyss.multithreading;

public class TestRunnable
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		MyRunnable mr=new MyRunnable();
		//mr.start(); undefined in Runnable
		Thread th =new Thread(mr);
		th.start();
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("Main thread");	
		}
		System.out.println("End of main() method");
	}
}
