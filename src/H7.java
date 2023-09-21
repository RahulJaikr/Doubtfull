
import java.util.ArrayList;
//import java.util.collection;
public class H7 
{
	static void run()
	{
	System.out.println("my name ishhh");
	}
	
	int a;
	int b;
	
	H7(int x , int y)
	{
	a=x;
	b=y;
		System.out.println(a+"   "+"  "+b);
		System.out.println(x+"   "+"  "+y);
	}
	
	public static void main(String[] args) 
	{
		
		H7 h = new H7(10,20);
		
	System.out.println(h.a);
	//int z =a;
	//	System.out.println(x+"   "+"  "+y);
		ArrayList al = new ArrayList();
		
            al.add(100);
            al.add("deepka");
            al.add('c');
            al.add("jaikr ");
            System.out.println(al);
            System.out.println(al.add("jajaja"));
            System.out.println(al);
            System.out.println(al.contains(200));// it is not contain 200
            System.out.println(al.contains(100));
            System.out.println(al.isEmpty());
            System.out.println(al.size());
            System.out.println(al.remove("jajaja"));//it will take object
            al.remove(2);// it is map for index position
            al.removeAll(al);
            System.out.println(al);
            ArrayList al2 = new ArrayList();
            al2.add("jaikr");
            al2.add("RAhul");
            al2.add("amisth");
            al.removeAll(al2);
            System.out.println(al2.isEmpty());
            System.out.println(al2);
            System.out.println(al);
            al2.clear();
            System.out.println(al2);
            H7.run();
            
            
            
           /* ArrayList al2 = new ArrayList();
            al2.add("jaikr");
            al2.add("RAhul");
            al2.add("amisth");
            System.out.println(al2);
            al.addAll(al2);  
            System.out.println(al);*/
            
	}
}
