public class Student
{
	String name;
	int id;
	String email;
	long mno;
	String branch;
	Student(String name,int id,String email,long mno,String branch)
	{
		this.name=name;
		this.id=id;
		this.email=email;
		this.mno=mno;
		this.branch=branch;
		
	}
	public void studentDetails()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student id is "+id);
		System.out.println("Student number is "+mno);
		System.out.println("Student email is "+email);
		System.out.println("Student branch is "+branch);
		System.out.println("***************************************");
	}
}
