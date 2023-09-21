
public class A10 
	{
		void show(int a , String b)
		{
			System.out.println("1st show method");
		}
		void show(String a, int b)
		{
			System.out.println("2nd show method");
		}
		public static void main( String []args)
		{
			A10 a = new A10();
			a.show(10,"jaikr");
			a.show("name", 10);
		}
		}

