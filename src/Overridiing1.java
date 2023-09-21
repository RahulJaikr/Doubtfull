
class Overridiing1 
{
	 public void show() 
	 {
  	   int a =10;
  	   int b =30;
  	   int c = (a*b);
  	   System.out.println(c);
     }
}
 class Sys extends Overridiing1
{
	public void show()
	{
		
		System.out.println("class 2 method");
	}
	
	
	public static void main(String[] args) 
	{
		Sys a = new Sys();
		a.show();
		a.show();
		Overridiing1 b = new Overridiing1();
		b.show();
      
	}// same method in 2 class
// when we have 2 two class and same method in 2 class so when
// we create object so it will only call it is own same method
	// if we want to call 
	//parent class same method then we can use super keyword
	// then we can use super keyword
}
