package automation.PageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BtnEnabledPage4 
{
	WebDriver driver;
   
	//constructor
	public BtnEnabledPage4(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//Locator
	By first_btn=By.cssSelector(".btn-lg.btn-primary") ;
	By second_btn=By.cssSelector(".btn.btn-lg.btn-secondary");
	
	//Action Methods
	public WebElement FirstBtn()
	{
		return driver.findElement(first_btn);
	}
	
	public WebElement SecondBtn()
	{
		return driver.findElement(second_btn);
	}
	
}
