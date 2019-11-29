package com.tyss.thread.properties;

public class MyIdThread extends Thread
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		MyIdThread mi=new MyIdThread();
		System.out.println("myid thread id is "+mi.getId());
		//mi.setId(); don't have setId() method
		
		System.out.println("main thread priority is "+Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(20);  java.lang.IllegalArgumentException
		
		System.out.println("main ended");
	}
}
