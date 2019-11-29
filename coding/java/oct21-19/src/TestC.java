public class TestC 
{
	public static void main(String[] args)
	{
		Person.color="white";
		Person.sleep();
		System.out.println("person color is "+Person.color);
		Person p=new Person();
		p.age=23;
		p.name="Abhinav kumar";
		System.out.println("person name is "+p.name);
		System.out.println("person age is "+p.age);
	}
}
