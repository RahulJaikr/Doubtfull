
public class Over1 
{
 void pratice(String a, int b )
 {
	 System.out.println("Seqeunce of Arguments");
	 
 }
 void pratice(int a, String b)
 {
	 System.out.println("Different of Arguments"); 
 }
 void practice()
 {
	 System.out.println("diffetnt ways of args");
 }
 public static void main (String[] args)
 {
	Over1 a1 = new Over1();
	a1.pratice(12, null);
	a1.pratice("Shreya Jain", 12);
	a1.practice();
	 
 }
}
