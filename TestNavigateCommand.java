package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommand {

	WebDriver driver;
	
	public void InvokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
		    NevigateCommand();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void NevigateCommand()
	{
		try {
			driver.navigate().to("http://www.ebay.com");
			driver.findElement(By.linkText("Motors")).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		TestNavigateCommand obj1 = new TestNavigateCommand();
		obj1.InvokeBrowser();
		
	}

}
