
public class E 
{
 static int a= 10;
 
 void m1() 
 {
		int a =100;// can not declair static variable inside method
}
	public static void main(String[] args) 
	{
		System.out.println(a);
		E e1 = new  E();
		e1.m1();
	}}
