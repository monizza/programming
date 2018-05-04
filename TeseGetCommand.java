package Selenium.webdriver.basic;


import org.openqa.selenium.By;


public class TeseGetCommand extends Invokebrowser
{
	
	public static void main (String[] args)

	{
		TeseGetCommand obj1 = new TeseGetCommand();
		obj1.InvokeBrowser();
		obj1.getcommands();
	}
	
	public void getcommands()
	{
		driver.get("http://www.amazon.com");
		String titleofthepage = driver.getTitle();
		System.out.println("Title of the page is "+ titleofthepage);
		driver.findElement(By.linkText("Today's Deals")).click();
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("this is current URL is "+ CurrentUrl);
		System.out.println("This is current page source"+ driver.getPageSource() );
		driver.getTitle();
		
		
	}
	

	
	}	


