public class TestE 
{
	public static void main(String[] args)
	{
		Student.cname="jspider";
		Student s1= new Student();
		s1.name="Abhinav";
		s1.usn=101;
		System.out.println("college name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("Id is "+s1.usn);
	}

}
