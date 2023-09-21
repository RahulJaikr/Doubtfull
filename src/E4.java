
public class E4 
	{
		int empid;
		String name;
		static String Company = "newgen";
		 E4(int epmid,  String name)
		 {
			this.empid =empid;
			this.name= name;
		 }
		 void display() 
		 {
			 System.out.println(empid+" "+name+" "+Company);
		 }
		 public static void main(String []args)
		 {
			 E4 e = new E4(101,"jaikr");
			 E4 f = new E4(102,"Smith");
			 e.display();
			 f.display();
		 }}
