public class Person 
{
	String name;
	int age;
	Person(String pname,int page)
	{
        name=pname;
        age=page;
    }
	public static void main(String[] args)
	{
		Person p= new Person("Abhinav",22);	
		Person p1= new Person("Aniket",23);	
		Person p2= new Person("Chandan",24);	
	}
}
