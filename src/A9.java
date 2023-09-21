
public class A9 
{
void show(int a , int b)
{
	System.out.println("1st show method");
}
void show(int c)
{
	System.out.println("2nd show method");
}
public static void main( String []args)
{
	A9 a = new A9();
	a.show(10);
}
}
