class D14
{
	D14(D3 e)
	{
		System.out.println("D14 class constructor ");
	}
}
public class D3
{
    void m1()
    {
    	D14 d = new D14(this);
    }
	public static void main(String[] args) 
	{
	 D3 e = new D3();
	 e.m1();
	}}
