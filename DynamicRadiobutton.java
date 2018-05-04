package Selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadiobutton {

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
			driver.get("http://echoecho.com/htmlforms10.htm");
			int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

			for (int i =0;i<count;i++)
			{
				//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
				/*----------dynamic selection without radio button-*/
				String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
				if (text.equals("Cheese"))
				{
					driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				}
				
				//Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
