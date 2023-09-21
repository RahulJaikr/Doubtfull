
abstract class C3 
	{
	int number_of_tyre;
	 abstract void start();
	
}
class C13 extends C3
{
void start()
{
	System.out.println("start with key");
}
}
class C14 extends C3

{
	void start()
	{
		System.out.println("Sctoer is running");
	}
	public static void main (String []args)
	{
		//C3 c = new C3 ();
		//c.start();
		C14 c = new C14();
		c.start();
		C13 cc = new C13();
		cc.start();
			}
}