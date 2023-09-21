

//use modifier 
//Default modifier 

public class Load4 
{
   public void show() 
  {
	  System.out.println("Run-time-error");
	 
  }
}
 class Abcd extends Load4
{
	  public void show()throws ArithmeticException
	
	 {
		 System.out.println("Compile-time-error");
		 
	 }
	 public static void main(String[] args)
	 {
		 Abcd xyz = new Abcd();
		 xyz.show();
		 
		 Load4 l2 = new Load4 ();
		 l2.show();
				 
	 }
}