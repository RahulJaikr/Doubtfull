package java.util;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println("Im in a gitHub project ");
	}
 public void Test()
 {
	 System.out.println("im very laxy person");
 }
}
