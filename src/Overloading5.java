public class Overloading5

{
	public void show(Object a)
	{
		System.out.println("Object is a p[arent class of java");
	}
	public void show(String a)
	{
		System.out.println(" Sring method");
	}
	public void show (StringBuffer a)
	{
		System.out.println(" string buffer method");
	}
	
	public static void main ( String args [])
	{
		Overloading5 a = new Overloading5();
		
		//a.show('a'); object is a parent class of all the java classes
		a.show("jaikr");
		// when we call same thype of argument with variable it will give 
		// prefrence for child class
		
		
		Overloading5 b = new Overloading5();
		b.show("jaikr");
		// it will always print child class value or compiler will give 
		// importance opf child class
		b.show(new StringBuffer ("jaikr"));
		// it will print string buffer
		// b.show(null);
		//ambiguoes becuse both (string and string Buffer belong to same class)
		
	}}
