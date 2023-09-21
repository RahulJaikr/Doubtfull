
public class B8 
{
  void show()
  {
	  System.out.println("class b8 is running");
  }
}
class BB extends B8
{
	void show()
	{
		System.out.println("Class bb is running");
	}
public static void main ( String []args)
{
	BB b = new BB();
	b.show();
	B8 b1 = new B8();
	b1.show();
}
}
