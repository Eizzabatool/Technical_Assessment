package automation.TestFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.PageFiles.BtnEnabledPage4;

/*
-Navigate to the home page
-In the test 4 div, assert that the first button is enabled 
 and that the second button is disabled
 */
public class BtnEnabledTest4 
{ 
	WebDriver driver; 
	
    @BeforeClass
	public void navigate() 
    {   	
       driver= new ChromeDriver();
	   driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
	}
    
    @Test(priority=1)
    public void IsEnabled()
    {
       BtnEnabledPage4 BtnEnabledPage= new BtnEnabledPage4(driver);
       
       //Verify that the button is Enable
       Assert.assertTrue( BtnEnabledPage.FirstBtn().isEnabled(),"First Button should be enabled");
    }
    
    @Test(priority=2)
    public void IsDisabled()
    {
       BtnEnabledPage4  BtnEnabledPage= new BtnEnabledPage4(driver);
       
       //Verify that that the button is disable
       Assert.assertFalse( BtnEnabledPage.SecondBtn().isEnabled(),"Second Button should be disabled");
    }	
}
