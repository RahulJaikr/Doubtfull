class D11
{
	int i =10;
}
public class D5 extends D11
{
	int i =20;
	void show(int i)
	{
		System.out.println(super.i);
		System.out.println(this.i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		D5 d = new D5();
		d.show(30);
	}}
