
public class Over4 
{
	// void show(Object a)
	void show(String a) 
	{
		System.out.println("object print");

	}

	// void show(int a)
	void show(StringBuffer a) 
	{
		System.out.println("string print");

	}

	public static void main(String[] args)
	{
		Over4 o4 = new Over4();
		o4.show("JAikr");
		o4.show(new StringBuffer("priya"));

	}

}
