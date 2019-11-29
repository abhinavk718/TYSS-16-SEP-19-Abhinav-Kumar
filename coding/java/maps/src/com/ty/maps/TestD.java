package com.ty.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer>lh=new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 880000);
		for(Map.Entry<String, Integer>m : lh.entrySet())
		{
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("========================================");
		}	
	}
}
