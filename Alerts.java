package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

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
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.findElement(By.xpath("//input[@type ='button']")).click();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();// accept() method use for positive senerios means yes , ok 
			//driver.switchto().alert().dismiss();// dismiss() will be use if you want to cancel something on popup
			//to edit text on javascript popup below is the command 
			
			//driver.switchTo().alert().sendKeys("kahd");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
