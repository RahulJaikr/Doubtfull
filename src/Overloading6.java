

public class Overloading6 
{
	public void show(int a , float b)
	{
		System.out.println("int float method");
	}
	public void show(float a,int b)
	{
		System.out.println(" float int method");
	}
	public void show (String b , float a)
	{
		System.out.println(" Now it will compile becuse we are giving ");
	}
	
	public static void main ( String args [])
	{
		Overloading6 a = new Overloading6();
		a.show(10,20.20f);
		a.show(240.90f,78);
		//a.show(10, 30);// it won't automatically promote
		a.show("jaikr", 30);
		// it will promote because 1syt we get string then 
		// int will automatically convert in float
		
		
}}
