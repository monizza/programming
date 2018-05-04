package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E 
{WebDriver driver;

public void InvokeBrowser()
{
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com/");
		XpathCSSbyown();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public void XpathCSSbyown()
	{
		
		driver.findElement(By.cssSelector("a[title*='Already']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name, 'proce')]")).click();
		
	}

public static void main(String[] arg)
{
	salesforceE2E example = new salesforceE2E();
	example.InvokeBrowser();
}
}
