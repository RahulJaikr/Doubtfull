
//final class D71
 class D71
{
	 void m1() {
		//void m1() {
		System.out.println("i am in class D21");
	}
}
class D70 extends D71
{
	
   void m1() 
   {
	   super.m1();
	   System.out.println("i am in class D7");
   }
	public static void main(String[] args) 
	{
		D70 d = new D70();
		d.m1();
	}}

