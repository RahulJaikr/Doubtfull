class Od 
{
	 public void run() 
	 {
  	   System.out.println("class 1 method");
     }
}
 class Sys1 extends Od
{
	public void show()
	{
		
		System.out.println("class 2 method");
	}
	
	public static void main(String[] args) 
	{
		Sys1 a = new Sys1();
		a.show();
		a.run();
		Od b = new Od();
		//b.show();
		
		
		
		// we can use covernt reutrn type 
		// if we have a parent class method return type parent contain
		// for child class method we can use child return type.
		
		
		// abstract class 
		// if we are creating abstrcat class then we have overrdie abstract method
		// we can not create object of abstract class
	}}