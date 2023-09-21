class D18
{
	D18()
	{
		System.out.println("i am in class d18");
	}
}
public class D8 extends D18
{
	D8()
	{
		//super(); result will be same if we use or not
		System.out.println("i am in class d8");
	}

	public static void main(String[] args) 
	{
		
      D8 d = new D8();
	}}
