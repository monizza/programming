package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.Screen;

public class Locators {
	//Screen 
	WebDriver driver;
	public void InvokeBrowser(String url)
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void locatorsUsingAmazon()
	{
		try {
			InvokeBrowser("http://www.amazon.com");
			driver.findElement(By.linkText("Today's Deals")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo laptop");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Gift")).click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void LocatorsUsingFacebook()
	{
		try {
			InvokeBrowser("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Monizza");
			
			driver.findElement(By.cssSelector("input#email")).sendKeys("monizza052@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Closebrowser()
	{
		driver.close();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Locators obj1 = new Locators();
		//obj1.locatorsUsingAmazon();
		obj1.LocatorsUsingFacebook();
	}

}
