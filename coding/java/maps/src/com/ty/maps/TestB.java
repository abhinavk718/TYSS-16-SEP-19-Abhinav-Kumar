package com.ty.maps;

import java.util.HashMap;

public class TestB
{
	public static void main(String[] args)
	{
		HashMap hm=new HashMap<>();
		hm.put("kuku", 998014);
		hm.put("mala", 678941);
		hm.put("sheela", 789785);
		
		HashMap hm1=new HashMap<>();
		hm1.put("deepu", 789099);
		hm1.put("riya", 678909);
		hm1.put("kriti", 467787);
		
		boolean hasKey=hm.containsKey("mala");
		System.out.println("Has key---------->"+hasKey);
		
		boolean hasValue=hm.containsValue(998014);
		System.out.println("Has value---------->"+hasValue);
		
		hm.putAll(hm1);
		System.out.println("After putting");
		System.out.println("After putAll()--->"+hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}

}
