import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no. ");
		int no1 = s.nextInt();
		System.out.println("enter Second no. ");
		int no2 = s.nextInt();
		System.out.println("enter Symbol(+,-,*,/ ");
		String sym = s.next();
		int res;
		switch(sym)
		
		{
			case "+": res = no1 +no2;
			System.out.println("addintion is "+res);
			break;
			case "-": res = no1-no2;
			System.out.println("sub is "+res);
			break;
			case "*": res = no1 *no2;
			System.out.println("Multification is "+res);
			break;
			case "/": res = no1 /no2;
			System.out.println("div is "+res);
			break;
			default: System.out.println("invlid Sysmbol");
			break;
		}
	}
}
