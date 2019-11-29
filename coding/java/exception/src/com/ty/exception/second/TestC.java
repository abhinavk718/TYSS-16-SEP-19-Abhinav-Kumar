package com.ty.exception.second;

import java.util.Scanner;

public class TestC
{
	public static void main(String[] args) 
	{
		//Scanner sc1=new Scanner(System.in);
		try(Scanner sc=new Scanner(System.in))//try with resources
		{
			System.out.println("Enter  number");
			int a=sc.nextInt();
			System.out.println(a);
			System.out.println(a/0);	
		}
		catch (ArithmeticException ae) 
		{
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("Finally executed");
		}
		
	}

}
