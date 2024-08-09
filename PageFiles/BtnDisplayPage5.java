package automation.PageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BtnDisplayPage5 
{
	WebDriver driver;
	   
	//constructor
	public BtnDisplayPage5(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	//Locators
	 By test5_btn=By.id("test5-button");
	 By test5_alert=By.id("test5-alert");
	 
	 //Action methods
	 public WebElement Test5_Btn()
	 {
		 return driver.findElement(test5_btn);
	 }
	 
	 public WebElement Test5_Alert()
	 {
		 return driver.findElement(test5_alert);
	 }
}
