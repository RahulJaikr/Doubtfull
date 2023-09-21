class D17
{
void m1()
{
	System.out.println("class a method");
}
}
public class D6 extends D17
{
  void m1() 
  {
	 System.out.println("i m in class b"); 
  }
  void show()
  {
	  m1();
	  super.m1();
  }
	public static void main(String[] args) {
		D6 d = new D6();
		d.show();
}}
