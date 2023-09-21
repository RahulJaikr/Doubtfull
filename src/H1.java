class H1
{
	public static void main(String[] args) 
	{
		H1 h = new H1();
		h.d();
		System.out.println("exception is handled ");
	}
		void d() 
		{
		try
		{
		int a = 100, b= 0, c;
		c= a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
		 System.out.println(e);	
		}
		}
}