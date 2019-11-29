public class TestA 
{
	public static void main(String[] args)
	{
		Pen p = new Pen();
		p.cost=100;
		p.color="black";
		p.brand="cello";
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brandis "+p.brand);
		p.Write();
		System.out.println("**********************************");
		Van v = new Van();
		v.cost=1001000;
		v.color="black";
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van color is "+v.color);
		v.move();
		System.out.println("**********************************");
		Van v1 = new Van();
		v1.cost=5000000;
		v1.color="black";
		System.out.println("Van cost is "+v1.cost);
		System.out.println("Van color is "+v1.color);
		v1.move();
	}
}
