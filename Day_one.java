package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;


public class Day_one {
	WebDriver driver;
	//JavascriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			// below lines are controlling your browser 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	public void searchCourse()
	{
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			driver.findElement(By.id("collapseMfilter")).click();
			
			//jse = (JavascriptExecutor)driver;
			//jse.executeScript("scroll(0,300)");
			
			driver.findElement(By.xpath("//input[//label[contains(text(),'dropdown-backdrop')]")).click();
			driver.findElement(By.xpath("//label[contains(text(), 'Weekend')]")).click();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args)
	{
		Day_one myobject = new Day_one();
		myobject.invokeBrowser();
	}

}
