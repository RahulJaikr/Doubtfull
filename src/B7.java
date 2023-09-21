
public class B7 
{
	void show( String a , float b)
	{
		System.out.println(" int float  show method");
	}
	void show( float a , int b)
	{
		System.out.println("float int show method");
	}
	public static void main( String []args)
	{
		B7 a = new B7();
		//a.show(10,20.5f);
		a.show(10.25f,100);
		a.show("jaikr", 20);
	}
	}


