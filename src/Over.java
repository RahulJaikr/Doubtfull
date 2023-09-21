//No.of arguments
public class Over 
{
   void show(int a, int b )
   {
	   System.out.println("Over cell");
   }
   void show(int c )
   {
	   System.out.println("C is print");
   }
   public static void main(String[] args)
   {
	   Over a = new Over();
	   a.show(10);
	   a.show(30,50);
   }
}
