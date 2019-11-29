package com.tyss.thread.properties;

public class MyThread extends Thread
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		
		String tname=Thread.currentThread().getName();
		System.out.println("Current thread is "+tname);
		
		MyThread t1= new MyThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("Bala");
		t1.setName("Golu");
		System.out.println("My thread name is "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main ended");
	}
}
