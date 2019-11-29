public class TestA
{
	public static int main(int a,int b)
	{
		System.out.println("add(int a,int b) method");	
		return a+b;
	}
	public static long main(long a,int b)
	{
		System.out.println("add(int a,int b) method");	
		return a+b;
	}
	public static void main(int a,byte b)
	{
		System.out.println("add(int a,int b) method");
	}
	public int multiply(int a,int b)
	{
		System.out.println("multiply(int a,int b) method");
		return a*b;
	}
	public int multiply(byte a,int b)
	{
		System.out.println("multiply(byte a,int b) method");
		return a*b;
	}
	public static void main(String[] args) 
	{
		System.out.println("main(String[] args) method");
		main(10);
	}
	public static void main(int a) 
	{
	   System.out.println("main(int a) method");	
	}
} 