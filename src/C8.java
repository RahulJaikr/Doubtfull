public class C8
{
	
	void display()
	{
		System.out.println("displa method is calling");
	}
	void show() 
	{
	 display();// this.display(); both are same
	}
}
class C18
{
	public static void main(String []args)
	{
		C8 c = new C8();
	
		c.show();
	}}