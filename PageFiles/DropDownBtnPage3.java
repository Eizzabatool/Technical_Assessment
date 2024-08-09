package automation.PageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownBtnPage3 

{
	   
	  WebDriver driver;
	
	  //Constructor
		public DropDownBtnPage3(WebDriver driver) 
		{
			this.driver=driver;
		}
		
	  //Locators
		By dropdown_btn=By.id("dropdownMenuButton");
		By dropdown_show=By.className("dropdown-menu");
		
		public By DropDownIndex(int Index) 
		{
	       By dropdown_item=By.xpath("(//a[@class='dropdown-item'])["+Index+"]");
	       return dropdown_item;
	    
		}
		
	  //Action Methods	    
	    public WebElement DropDownBtn() 
	    {
	    	return driver.findElement(dropdown_btn);
	    }
	    
	    public WebElement DropDownShow() 
	    {
	    	return driver.findElement(dropdown_show);
	    }
	    
	    public WebElement DropDownItem(int index) 
	    {
	    	return DropDownShow().findElement(DropDownIndex(index) );
	    }






}
