package com.ty.exception.customcheckedexception;

public class ValidateAmount
{
	void checkAmount(int amt) throws InvalidAmountException
	{
		if(amt>40000)
		{
			throw new InvalidAmountException();
		}
	}

}
