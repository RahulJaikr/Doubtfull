public class Overloading2

{
	public void show(int a)
	{
		System.out.println("first show");
	}
	public String show(String a)
	{
		System.out.println(" show");
		return a;
	}// we can not achive overloading by changing return type
	// void is a return type
	// when we can give any ohter return type we need to enter //return; keyword;
	public void show()
	{
		System.out.println(" third");
	}
	public static void main(String[] args)
	{// compiler will come to first main method
		// then check for object
		// after object check for argument
		Overloading1 a = new Overloading1();
		
		a.show(10);
		a.show();
		a.show("rahul");

	}

}