

public class Load1 
{
    public void show()
  {
	  System.out.println("Intelligent");
	 
  }
}
 class z extends Load
{
	  public void show() 
	
	 {
		 System.out.println("overrriding");
		 
	 }
	 public static void main(String[] args)
	 {
		 z xyz = new z();
		 xyz.show();
	 }
}