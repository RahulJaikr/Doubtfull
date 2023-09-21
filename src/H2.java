class H2
{
	public static void main(String[] args) 
	{
		H2 h = new H2();
		try 
		{
		h.d();
		}
		catch(Exception e)
		{
		 System.out.println(e);	
		
		}
		System.out.println("exception is handled ");
	}
		void d() 
		{
		int a = 100, b= 0, c;
		c= a/b;
		System.out.println(c);
		}}
