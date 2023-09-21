
public class C5 {
  private int emp_id;
  public void setEmpId(int eid)
  {
	  emp_id = eid;
  }
  public int getEmpid() {
	  return emp_id;
  }
}
class C15{
	public static void main(String[] args) 
	{
		C5 c = new C5();
		c.setEmpId(101);
		System.out.println(c.getEmpid());
	}
}
