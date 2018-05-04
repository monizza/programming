package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	WebDriver driver;
	
	public void InvokeBrowser() {
		
	
	try {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
			driver.get("https://login.salesforce.com/");
			XpathExample();
			
			
	} 
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void XpathExample()
	{
		try {
			
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Monizza");
			driver.findElement(By.cssSelector("#password")).sendKeys("123");
			//driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
			driver.findElement(By.cssSelector("#Login.button.r4.wide.primary")).click();
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Xpath xpath = new Xpath();
		xpath.InvokeBrowser();
	}

}
