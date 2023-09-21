
public class C6 
{
	int i;
	void setvalue(int x)
	{
		i=x;
	}
	void show() 
	{
		System.out.println(i);
	}
}
class C16
{
	public static void main(String []args)
	{
		C6 c = new C6();
		c.setvalue(10);
		c.show();
	}
}