
public class C // we need to give return type for diffrent object
{// and parent child object.
	Object show(String a, int b)
	  {
		  System.out.println("new c  string is running");
		  return null;
	  }
	public static void main ( String []args)
	{
		C m = new C();
		m.show("jaikr",10);
		BBB1 a1 = new BBB1();
		a1.show("rohit",101);
	}
}
	class BBB1 extends C
{
		String show(String a, int b)
		{
			System.out.println("child class bbb1 is running");
			return null;
		}
}
