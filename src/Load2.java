//use modifier 
//Default modifier 

public class Load2 
{
    void show()
  {
	  System.out.println("Intelligent");
	 
  }
}
 class X1 extends Load
{
	  public void show() 
	
	 {
		 System.out.println("overrriding");
		 
	 }
	 public static void main(String[] args)
	 {
		 X1 xyz = new X1();
		 xyz.show();
		 
		 Load2 l2 = new Load2 ();
		 l2.show();
				 
	 }
}