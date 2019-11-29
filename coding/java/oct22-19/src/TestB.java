public class TestB
{
	public static void add() 
	{
		// only final access modifier is supported by local variable
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);	
	}
	public static void main(String[] args)
	{
		add();
	}
}
