package com.ty.exception.customcheckedexception;

public class InvalidAmountException extends Exception
{
	String msg="Daily limit is 40000";
	@Override
    public String getMessage()
    {
		return msg;
    }
}
