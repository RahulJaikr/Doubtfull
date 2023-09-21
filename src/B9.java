
public class B9 
{
  void show(String a, int b)
	  {
		  System.out.println("new string is running");
	  }
}
	class Bb1 extends B9
{
		void show(String a, int b)
		{
			System.out.println("child class bb is running");
		}
	public static void main ( String []args)
	{
		Bb1 m = new Bb1();
		m.show("jaikr",10);
		B9 a1 = new B9();
		a1.show("rohit",101);
	}
	}

