package com.ty.sorting.list;

public class Student implements Comparable<Student> 
{
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage)
	{
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
/*	@Override
	public int compareTo(Student s) 
	{
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
  		{
  			return -1;
		}
		else
		{
			return 0;
		}
	}
	@Override
	public int compareTo(Student s) 
	{
		if(this.percentage>s.percentage)
  		{
  			return 1;
		}
		else if(this.percentage<s.percentage)
		{
			return -1;
		}
		else
		{
			return 0;
		}	
  } 
  @Override
	public int compareTo(Student s)
	{
	    int i=this.id;
	    int j=s.id;    invalid dont do this
	    
	    Integer i=this.id;
	    Integer j=s.id;
	    
	    return p.compareToIgnoreCase(q);
	}
  
*/
	@Override
	public int compareTo(Student s)
	{
	    String p=this.name;
	    String q=s.name;
	    return p.compareToIgnoreCase(q);
	}
}