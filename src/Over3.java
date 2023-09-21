//can we achieve method overloading by changing the return type
public class Over3 {

	public static void main(String[] args)
	{
		System.out.println("We can achevie main method ");
		Over3 o3 = new Over3();
		o3.main(10);

	}
  public static void main(int b ) 
  {
	  System.out.println("main method overloading");
  }
}
