
public class Demo {

	int a = 10;
	static int b = 20;
	public static void main(String[] args) 
	{
		Demo m = new Demo();
		System.out.println(m.a);
		System.out.println(m.b);
		m.a= 100;
		m.b =200;
		System.out.println(m.a);
		System.out.println(m.b);
		Demo n = new Demo();
		System.out.println(n.a);
		System.out.println(n.b);
		
	}

}
