public class G8
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 100, b= 2, c;
			c= a/b;
			System.out.println(c);
		}
		catch ( Exception e)// catch block will not execute
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("i am in finally block");
		}}}