
public class Over6 
{
	void show(int a, float b) 
	{
		System.out.println("we are trying typcasting");
	}

	void show(String a, int b) 
	{
		System.out.println("float int show method");
	}

	void show(float c, String b) 
	{
		System.out.println("float int show method");
	}

	
	public static void main(String[] args) 
	{
		Over6 O5 = new Over6();
		O5.show(10, 23.43f);
		O5.show(234.34f, "Shreya");
		O5.show("Jaikr", 110);
	}
}
