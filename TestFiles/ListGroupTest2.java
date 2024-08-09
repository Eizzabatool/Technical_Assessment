package automation.TestFiles;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.PageFiles.ListGroupPage2;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import java.util.List;

/*
     Test Case 2
-Navigate to the home page
-In the test 2 div, assert that there are three values in the listgroup
-Assert that the second list item's value is set to "List Item 2"
-Assert that the second list item's badge value is 6
 */

public class ListGroupTest2 
{
	WebDriver driver;
	
	@BeforeClass
	public void navigate() 
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
	}
	
	@Test(priority=1)
	public void ListGroup() 
	{	
		ListGroupPage2 ListGroupPage=new ListGroupPage2(driver);	
		
		//Verify the number of values in the listgroup
		Assert.assertEquals(ListGroupPage.listGroup().size(),3,"List group should contain exactly 3 items.");
	}
	

	@Test(priority=2)
	public void SecondListItem() 
	{	
		// Instantiating the Class
		ListGroupPage2 ListGroupPage=new ListGroupPage2(driver);
		
		//Getting the Text
		String fullText=ListGroupPage.secondListItem().getText();
		int badgeIndex = fullText.lastIndexOf(" ");
		String textonly =fullText.substring(0,badgeIndex).trim();
		
		//Verify the second list item text
		Assert.assertEquals(textonly,"List Item 2","Text should match exactly");	
	}
		
	@Test(priority=3)
	@Parameters({"BadgeNum"})
	public void BadgeValue(String BadgeNum) 
	{
		ListGroupPage2 ListGroupPage=new ListGroupPage2(driver);
		int badgeNumInt = Integer.parseInt(BadgeNum);
		
	   //Verify the second list item's badge value
	   Assert.assertEquals(Integer.parseInt(ListGroupPage.badgeValue().getText()),badgeNumInt ,"Bagde value should match exactly");
	}	
}
