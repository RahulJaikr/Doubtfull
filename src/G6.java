
public class G6 
{
	public static void main(String [] args)
	{
		try
		{
			int a = 100,b=0,c;
			c= a/b;
			System.out.println(c);
					}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println();
			System.out.println(e);
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println( e.getMessage());
					}
	}

}
