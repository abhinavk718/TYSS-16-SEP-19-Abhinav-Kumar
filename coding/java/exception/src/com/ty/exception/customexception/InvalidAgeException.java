package com.ty.exception.customexception;

public class InvalidAgeException extends RuntimeException
{
	String msg="Invalid Age below 18 years not allowed";
	public InvalidAgeException()
	{
		
	}
	public InvalidAgeException(String msg)
	{
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage()
	{
		return msg;
	}
}
