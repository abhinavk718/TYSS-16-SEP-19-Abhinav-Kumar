package com.tyss.thread.properties;

public class MyPriorityThread extends Thread
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		int p=Thread.currentThread().getPriority();
		System.out.println("Main thread priority is "+p);
		Thread.currentThread().setPriority(7);
		System.out.println("Main thread priority is "+Thread.currentThread().getPriority());
		
		MyThread mt=new MyThread();
		int q=mt.getPriority();
		System.out.println("MyThread thread priority is "+q);
		mt.setPriority(6);
		System.out.println("Mypriority thread priority is "+mt.getPriority());
		System.out.println("main ended");
	}
}
