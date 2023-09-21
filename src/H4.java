import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
public class H4


{
 public static void main(String [] args)
 {
	
	 //int age = 16;
	 
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter your age : ");
	 int age = s.nextInt();
	 try {
	 if(age <18)
	 {
		 throw new YoungerAgeException(" you are not eligable for vote");
		// System.out.println("you ");
	 }
	 else
	 {
		 System.out.println("you can vote");
	 }}
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 System.out.println("hellow");
 }
}