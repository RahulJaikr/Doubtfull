
public class D2 
{
	void m1(D2 e)// we can give any reference here it is not necesaary 
	{//object = refrence
		System.out.println("i am in m1 method");
	}
    void m2() 
    {
    	m1(this);
    }
	public static void main(String[] args) 
	{
		//D2 d = new D2();
		//d.m2();
		D2 m = new D2();
		m.m2();

	}}
