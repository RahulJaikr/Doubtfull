
  abstract class Vehicle 
  {
   abstract void  show(); 
   
  }
   class Mnc extends Vehicle
  {
	   void show()
	  {
		  System.out.println("car starts with keys");
	  }
	  public static void main(String[] args) 
	  {
		  Mnc mnc = new Mnc();
		  mnc.show();
	  }
  }
