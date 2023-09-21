
public class Loading1
{
	void show(int b, String c) 
	{
//	 int a = 10 ;
//	 int b =  20;
//	 int c = a+b;
		System.out.println("apche j-meter");

	}
}

class bb2 extends Loading1 
{
	void show(int a, String b) 
	{
		System.out.println("B1 is method it look like alphabetes");
	}

	public static void main(String[] args)

	{
		bb2 bb = new bb2();
		bb.show(40, "Jain Sagar");

		Loading1 l1 = new Loading1();
		l1.show(10, null);
		bb.show(10, "Ranu Jain");
	}

}
