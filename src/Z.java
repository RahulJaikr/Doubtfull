
public class Z 
{
	void showZ()
	{
		System.out.println("z class method");
		
	}
}
class Z1 extends Z{
	void showZ1()
	{
		System.out.println("Z1 class method");
	}
	}
	class Z3 extends Z{
		void showZ3()
		{
			System.out.println("Z3 class method");
		}
	
	public static void main(String[] args) {
		Z3 zo = new Z3();
		zo.showZ3();
		//zo.showZ1(); we can not call Z1 class object beusce we don't have 
		//object of Z1 class object
				zo.showZ();
				Z1 a = new Z1();
				a.showZ1();
	}
	}


