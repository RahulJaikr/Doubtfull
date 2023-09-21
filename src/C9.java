
public class C9 
{
	C9()
	{
		this(10);
		System.out.println("no argument consturctor");
	}
	C9( int a )
	{
		//this() we can only one constructor by this keywords
		System.out.println("Parametrize constructor consturctor");
	}
  public static void main(String []args)
  {
	  C9 c = new C9();
	  C9 d = new C9(10);
	  
  }
}
