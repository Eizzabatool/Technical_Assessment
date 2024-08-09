package automation.TestFiles;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.PageFiles.DropDownBtnPage3;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;

/*
   Test Case 3
-Navigate to the home page
-In the test 3 div, assert that "Option 1" is the default selected value
-Select "Option 3" from the select list
 */
public class DropDownBtnTest3 {
  
	
 WebDriver driver;
	
	@BeforeClass
	public void navigate() 	
	{	
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
	}
	
	
	@Test(priority=2)
	public void defaultSelected() 
	{	
		DropDownBtnPage3 DropDownBtnPage=new DropDownBtnPage3(driver);
		
		//Assert that the button text is as expected
		Assert.assertEquals(DropDownBtnPage.DropDownBtn().getText(),"Option 1","Default Selected Value should be 'Option 1'");
	}
	
	@Test(priority=3)
	public void selectOption3()
	{
		//Instantiating the class
		DropDownBtnPage3 DropDownBtnPage=new DropDownBtnPage3(driver);	
		
		//Clicking the drop down button
		DropDownBtnPage.DropDownBtn().click();
		
		// Click on Option 3 on drop down menu
		DropDownBtnPage.DropDownItem(3).click();	
	}
}
