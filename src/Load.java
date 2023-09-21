
public class Load 
{
   void show()
  {
	  System.out.println("Im girl");
	 
  }
}
 class Xyz extends Load
{
	  public void show() 
	
	 {
		 System.out.println("overrriding");
		 
	 }
	 public static void main(String[] args)
	 {
		 Xyz xyz = new Xyz();
		 xyz.show();
	 }
}