class D21
{
	void m1() {
		//void m1() {
		System.out.println("i am in class D21");
	}
}
public class D7 extends D21

{
   void m1() 
   {
	   super.m1();
	   System.out.println("i am in class D7");
   }
	public static void main(String[] args) 
	{
		D7 d = new D7();
		d.m1();
			}}
