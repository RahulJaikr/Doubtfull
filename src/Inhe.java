
public class Inhe 
 {
//		void showA()
//		{
//		System.out.println("a class method");
//		}
		void run() {
			System.out.println("run a ");
		}
}
class Inhe2 extends Inhe

{
	void run() 
	{
		System.out.println("run a b ");
	}	
	
	void showB()
		{
		System.out.println("b class method");
		}
	public static void main(String[] args) 
	{
			Inhe2 g = new Inhe2();
		g.showB();
		//g.showA();
		g.run();
	}
}


