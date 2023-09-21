
public class D1 {

	D1()// we can create only one constructor
	{
		this(10);
		System.out.println("no argument constructor");
	}
	D1(int a)
	{
		System.out.println("int argument constructor");
	}
	public static void main (String []args)
	{
		D1 d = new D1();
	}
}
