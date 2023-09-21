import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
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
public class H5 
{
	/*public static void main(String[] args)
	{
		ReadAndWrite r = new ReadAndWrite();
		r.readFile();
		r.saveFile();
	}*/
	public static void main(String[] args)
	{
		ReadAndWrite r = new ReadAndWrite();
		try 
		{
		r.readFile();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
		try
		{
		r.saveFile();
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
		}
		System.out.println("jaikr");
	}}
