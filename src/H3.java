import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
public class H3 
{
 public static void main(String [] args)
 {
	
	 //int age = 16;
	 
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter your age : ");
	 int age = s.nextInt();
	 if(age <118)
	 {
		 throw new YoungerAgeException(" you are not eligable for vote");
	 }
	 else
	 {
		 System.out.println("you can vote");
	 }
 }
}
