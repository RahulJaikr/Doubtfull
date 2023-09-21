import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  =  new ChromeDriver();
		
		//First go to website than hit the URL 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Now inspect edit box like username edit box  we do grab this edit box 
		//so right click on box 
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//than inspect password 
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Jaikr@7566#");
		
		//than go to sign button 
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("p.error")).click();
		Thread.sleep(4000);
		//than we do forgot password 
		driver.findElement(By.linkText("Forgot your password?")).click();

	}

}
