import java.util.ArrayList;
import java.util.LinkedList;

public class H8 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("arraylistobject");
	  LinkedList l1 = new LinkedList(al);
	  l1.add(204);
	  l1.add(295);
	  l1.add(98);
	  l1.add(295);
	  l1.add("jaikr");
	  l1.add("jaikr");
	  l1.add("Smith");
	   
	  System.out.println(l1);
    }}
