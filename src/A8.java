
public class A8 {
	void showA()
	{
		System.out.println("a class method");
	}
}
class Aa extends A8
{
	void showB()
	{
		System.out.println("b class method");
	}
	public static void main(String[] args) 
	{
		Aa g = new Aa();
		g.showB();
		g.showA();
	}
}
