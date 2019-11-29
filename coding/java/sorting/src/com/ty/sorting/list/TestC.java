package com.ty.sorting.list;

import java.util.LinkedList;

public class TestC 
{
	public static void main(String[] args)
	{
		LinkedList<Integer>l=new LinkedList<>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		Integer peekElement=l.peek();
		System.out.println("Peak element "+peekElement);
		Integer peekFirstElement=l.peekFirst();
		System.out.println("Peak first "+peekFirstElement);
		Integer peekLastElement=l.peekLast();
		System.out.println("Peak last "+peekLastElement);
		System.out.println("After peak "+l);
		
		Integer poolElement=l.poll();
		System.out.println("poll element "+poolElement);
		Integer poolFirstElement=l.pollFirst();
		System.out.println("poll first element "+poolFirstElement);
		Integer poolLastElement=l.pollLast();
		System.out.println("poll last element "+poolLastElement);
		System.out.println("After pool "+l);
		
		l.push(12);
		System.out.println("After push "+l);
		Integer p=l.pop();
		System.out.println(p);
		System.out.println("After pop "+l);
	}
	

}
