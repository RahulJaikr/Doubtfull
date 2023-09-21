package java.util;

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
	public void show (long b , char a)
	{
		System.out.println(" string buffer method");
	}
	
	public static void main ( String args [])
	{
		Overloading6 a = new Overloading6();
		a.show(10,20.20f);
		a.show(240.90f,78);
		
}}
