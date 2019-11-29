package com.ty.google;

public class Test
{
     public static void main(String[] args)
     {
    	 Browser b=new Browser();
    	 GoogleDrive gd=new GoogleDrive();
    	 b.open(gd);
    	 Gmail g=new Gmail();
    	 b.open(g);
		
	}
}
