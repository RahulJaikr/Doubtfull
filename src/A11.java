
public class A11 
{
	void show( String b)
	{
		System.out.println("1st show method");
	}
	void show( int b)
	{
		System.out.println("2nd show method");
	}
	public static void main( String []args)
	{
		A11 a = new A11();
		a.show("jaikr");
		a.show( 10);
	}
	}
