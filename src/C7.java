public class C7
{
	int i;
	void setvalue(int i)
	{
	this.i=i;
	}
	void show() 
	{
		System.out.println(i);
	}
}
class C17
{
	public static void main(String []args)
	{
		C7 c = new C7();
		c.setvalue(10);
		c.show();
	}}