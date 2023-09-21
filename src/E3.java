
public class E3 
{
int empid;
String name;
String company;
 E3(int epmid, String name, String company)
 {
	this.empid =empid;
	this.company=company;
	this.name= name;
 }
 void display() {
	 System.out.println(empid+" "+name+" "+company);
 }
 public static void main(String []args)
 {
	 E3 e = new E3(101,"jaikr","newgen");
	 E3 f = new E3(102,"Smith","aus");
	 e.display();
	 f.display();
 }
}
