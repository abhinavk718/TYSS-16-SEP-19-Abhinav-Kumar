public class Employee1 
{
	String name;
	int id;
	
	public Employee1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void sayHello()
	{
		System.out.println("Welcome to testyantra");
	}
	
	void printDetails()
	{
		System.out.println("Person name is "+name);
		System.out.println("Person id is "+id);
		this.sayHello();
	}
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1("Deepika",101);
		e1.printDetails();
		Employee1 e2=new Employee1("Radhika",201);
		e2.printDetails();
		Employee1 e3=new Employee1("Pranshu",301);
		e3.printDetails();
	}
}

