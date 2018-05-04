package Selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSelenium extends Invokebrowser {
	
	public void ActionClass()
	{
	driver.get("https://www.amazon.com/");
	Actions a = new Actions(driver);
	WebElement e = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	a.moveToElement(e).build().perform();
	a.moveToElement(e).contextClick().build().perform();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ActionClassSelenium a = new ActionClassSelenium();
		a.InvokeBrowser();
		a.ActionClass();

	}

}
