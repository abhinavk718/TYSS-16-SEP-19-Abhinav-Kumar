package com.ty.abstraction;

public class Machine
{
	void slot(Atm a)
	{
		a.validateCard();
		a.getInfo();
	}
}
