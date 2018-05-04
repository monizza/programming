package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbrowser {
	
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
			Browser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Browser()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		
		Testbrowser obj1 = new Testbrowser();
		obj1.InvokeBrowser();
		// TODO Auto-generated method stub

	}

}
