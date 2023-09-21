
public class E5
{
int id;
String ename;
String comp;
 E5(int empid, String name, String company)
 {
		this.id =empid;
	this.comp=company;
	this.ename= name;
 }
 void display() {
	 System.out.println(id+" "+ename+" "+comp);
 }
 public static void main(String []args)
 {
	 E5 e = new E5(101,"jaikr","newgen");
	 E5 f = new E5(102,"Smith","aus");
	 e.display();
	 f.display();
 }
}
