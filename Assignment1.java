package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 

{
	WebDriver driver;
	public void InvokeBrowser()
	{
		
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munzi\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/interview.php");
		Movebetweenobject();
		textbasedpath();
		//driver.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void Movebetweenobject() throws InterruptedException
{
	driver.findElement(By.xpath(".//*[@id = 'tablist1-tab1']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id = 'tablist1-tab1']/following-sibling::li[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id = 'tablist1-tab1']/following-sibling::li[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id = 'tablist1-tab1']/following-sibling::li[3]")).click();
	Thread.sleep(3000);
	
}
public void textbasedpath()
{
	driver.findElement(By.xpath("//*[text() = ' Selenium ']" )).click();
}
public static void main(String[] args)
{

	Assignment1 newobj = new Assignment1();
	newobj.InvokeBrowser();
}

}
