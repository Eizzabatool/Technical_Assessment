package automation.PageFiles;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListGroupPage2 
{

	WebDriver driver;
	
	    //Constructor 
		public ListGroupPage2(WebDriver driver) 
		{
			this.driver=driver;
		}
	
	    //Locators
		By unordered_list=By.className("list-group");
		By list_group=By.cssSelector(".list-group-item.justify-content-between");
		By second_list_item=By.xpath("//li[contains(@class,'list-group-item') and contains(@class,'justify-content-between')][2]");
	    By badge_value=By.cssSelector(".badge.badge-pill.badge-primary");
	
	    //Action Methods
	    public WebElement unorderedList() 
	    {
	      return driver.findElement(unordered_list);
	    }
	    
	    public List<WebElement> listGroup() 
	    {
	      List<WebElement> listGroupItems= unorderedList().findElements(list_group);	
	      return listGroupItems;
	    }
	    
	    public WebElement secondListItem() 
	    {
	      return driver.findElement(second_list_item);
	    }
	    
	    public WebElement badgeValue() 
	    {
	      WebElement BadgeValue= secondListItem().findElement(badge_value);	
	      return BadgeValue;
	    }

	    
	    
}
