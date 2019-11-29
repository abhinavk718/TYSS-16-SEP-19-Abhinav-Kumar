package com.ty.sorting.comparator;

import java.util.Comparator;

public class BankingSortByName implements Comparator<Banking>
{

	@Override
	public int compare(Banking o1, Banking o2)
	{
		
		return o1.name.compareTo(o2.name);
	}

}
