package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdown {

	public static void main(String[] args) 
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.spicejet.com/");
			driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value = 'GOI']")).click();
			driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			/*------as in some of the website we need to check the dropdown as developer might give the same code for both the seletor
			 * so we need to define index of that second like in below */
			driver.findElement(By.xpath("(//a[@value = 'DEL'])[2]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
