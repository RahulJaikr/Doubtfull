import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWritee
{
	void readFile()throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	void saveFile()throws FileNotFoundException
	{
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d:/axy.tx");
	}
}
public class H6 
{
	public static void main(String[] args)throws FileNotFoundException
	{
		ReadAndWritee r = new ReadAndWritee();
		r.readFile();// it will throws exception in that method calling 
		// we need to handle the with try catch block
		
 }}
