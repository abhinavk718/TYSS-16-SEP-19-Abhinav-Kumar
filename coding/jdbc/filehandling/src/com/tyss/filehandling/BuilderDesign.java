package com.tyss.filehandling;

public class BuilderDesign
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer().append("Hello").append("Word");
		
		sb.append("Hello");
		
		sb.append("world");
		System.out.println(sb);
	}
}
