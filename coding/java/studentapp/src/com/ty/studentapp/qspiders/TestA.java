package com.ty.studentapp.qspiders;

import com.ty.studentapp.jspiders.Angular;
import com.ty.studentapp.jspiders.React;

public class TestA 
{
	public static void main(String[] args)
	{
		Qtp q=new Qtp();
		q.teachQtp();
		Selenium s=new Selenium();
		s.teachSelenium();
		Angular a=new Angular();
		a.teachAngular();
		React r=new React();
		r.teachReact();
	}
}
