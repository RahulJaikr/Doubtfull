
public class Over5 
{
	void show(int a, float b) 
	{
		System.out.println("we are trying typcasting");
	}

	void show(float a, int b) 
	{
		System.out.println("float int show method");
	}

	public static void main(String[] args)
	{
		Over5 O5 = new Over5();
		O5.show(10, 23.43f);
		O5.show(234.34f, 890);
	}
}
