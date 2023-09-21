
//use modifier 
//Default modifier 

public class Load3 
{
   public void show() throws Exception
  {
	  System.out.println("access modifier for an overridding method can allow more");
	 
  }
}
 class Abc extends Load3
{
	  public void show() throws Exception
	
	 {
		 System.out.println("Compile-time-error");
		 
	 }
	 public static void main(String[] args) throws Exception
	 {
		 Abc xyz = new Abc();
		 xyz.show();
		 
		 Load3 l2 = new Load3 ();
		 l2.show();
				 
	 }
}