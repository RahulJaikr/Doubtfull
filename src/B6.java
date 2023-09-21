
public class B6 
{
	void show( int a , float b)
	{
		System.out.println(" int float  show method");
	}
	void show( float a , int b)
	{
		System.out.println("float int show method");
	}
	public static void main( String []args)
	{
		B5 a = new B5();
		a.show(10,20.5f);
		a.show(10.25f,100);
	
	}
	}



