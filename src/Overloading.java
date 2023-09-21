
public class Overloading
{

	
	public void show1()
	{
		System.out.println("first show");
	}
	public void show2()
	{
		System.out.println(" show");
	}
	public void show()
	{
		System.out.println(" third");
	}
	public static void main(String[] args)
	{
		Overloading a = new Overloading();
   a.show1();
	}

}
