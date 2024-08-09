package automation.PageFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 
{
	WebDriver driver;
	
  //Constructor
	public LoginPage1(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	 
  //Locators
	By UserEmail_loc=By.id("inputEmail");
	By UserPassword_loc=By.id("inputPassword");
	By Btn_SignIn_loc=By.cssSelector(".btn.btn-lg.btn-primary.btn-block");
  
  //Action Methods
	public WebElement Email_Element() 
	{
		return driver.findElement(UserEmail_loc);
	}
	
	public WebElement Password_Element() 
	{
		return driver.findElement(UserPassword_loc);
	}
	
	public WebElement LoginBtn_Element() 
	{
		return driver.findElement(Btn_SignIn_loc);
	}
}
