
public class Loading
{
   void show()
   {
	   System.out.println("Method print is starting ");
	   
   }
}   
    class Second extends Loading
   {
	  void show() 
	  {
		System.out.println("Opps concept is very easy topic");
	  }
	  public  static void main(String[] args) 
	  {
		  //Second S1 = new Second();
			//S1.show();
			Loading L1= new Loading();
			L1.show();
	  }
   
}
