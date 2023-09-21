
public class G1
{
    //static int sum(int x, int ...arr)
	static int sum(int ...arr)// avilable as int [] arrary;
 {
	 int result =0;
	 for (int a:arr)
		 
	 {
		 result +=a;
	 }
	 return result;
 }
	public static void main(String[] args) 
	{
		System.out.println("the sum og 4 and 5 is"+sum (4,5));
		System.out.println("the sum og 4,3 and 5 is"+sum (4,5,3));
		System.out.println("the sum og 4,4,4 and 5 is"+sum (4,5,4,4));
		System.out.println("the sum og 4,8,8 and 5 is"+sum (4,5,8,9));

	}}
