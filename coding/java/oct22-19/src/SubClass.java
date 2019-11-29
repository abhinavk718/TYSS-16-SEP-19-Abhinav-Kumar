public class SubClass extends SuperClass 
{
	String s="Subclass variable";
	SubClass()
	{
		super();
		System.out.println("Subclass constructor");
	}
	void getData()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*********************************");
		super.supperClassMethod();
	}
}