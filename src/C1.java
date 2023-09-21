
public class C1 
{
	public void show()
	{
		System.out.println("parent class access modifier");
	}
}
class C12 extends C1
{
	public void show()// always give bigger access modifier for child class
	{
		System.out.println("child class access modfiers");
	}
	public static void main ( String [] args)
	{
		C1 n = new C1();
		n.show();
		C12 m = new C12();
		m.show();
	}
}
