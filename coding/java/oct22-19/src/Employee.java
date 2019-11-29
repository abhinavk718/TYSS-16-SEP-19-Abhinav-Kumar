public class Employee 
{
	String name;
	int id;
	
	public Employee(String ename,int eid)
	{
		name=ename;
		id=eid;
	}
	
	void printDetails()
	{
		System.out.println("Person name is "+name);
		System.out.println("Person id is "+id);
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Abhinav",102);
        e1.printDetails();
		Employee e2=new Employee("Rahul",202);
		e2.printDetails();
		Employee e3=new Employee("Aniket",303);
		e3.printDetails();
	}
}
