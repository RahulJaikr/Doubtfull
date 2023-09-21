class DemoB
{
	int i =10;
	public void run()
	{
		System.out.println("class b is runiing");
	}
	public void system()
	{
		System.out.println("i ma accessing b class method with a class object");
	}
}

public class DemoA extends DemoB

{
int i =20;
public void run()
{
	System.out.println("clASSS A  is runningh");
}
	
public static void main(String[] args) 

{
		DemoB b = new DemoB();
		System.out.println(b.i);
		b.run();
		
		DemoA a = new DemoA();
		System.out.println(a.i);
		a.run();
		a.system();
		
		DemoB c = new DemoA();
		System.out.println(c.i);
		c.run();
		
		int a1 []= {10133,20,30,40};
		System.out.println(a1[0]);

}

}
