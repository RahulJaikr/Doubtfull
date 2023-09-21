public class Overloading3

{
	public void show(int a)
	{
		System.out.println("first show");
	}
	public void show(String a)
	{
		System.out.println(" show");
	}
	public void show()
	{
		System.out.println(" third");
	}
	public static void main(String[] args)
	{// compiler will come to first main method
		// then check for object
		// after object check for argument
		Overloading1 a = new Overloading1();
		
//		a.show(10);
//		a.show();
//		a.show("rahul");
		a.show('a');
		// when we give any char value in this object ( it will)
		// automatically promate into int 

	}

}