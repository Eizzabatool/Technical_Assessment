package automation.TestFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import automation.PageFiles.BtnDisplayPage5;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import java.time.Duration;
public class BtnDisplayTest5 
{
    WebDriver driver; 
    
    @BeforeClass
	public void navigate() 
    {   	
       driver= new ChromeDriver();
      // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	   driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
	   
	}
    
    @Test(priority=1)
    public void BtnToBeDisplayed()
    {
    	
    	
    	BtnDisplayPage5 BtnDisplayPage=new BtnDisplayPage5(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        //Wait until the button is visible
        WebElement btn_element=wait.until(ExpectedConditions.visibilityOf(BtnDisplayPage.Test5_Btn()));
        btn_element.click();
        
        //Verify that the button is displayed
        Assert.assertTrue(BtnDisplayPage.Test5_Alert().isDisplayed());
    }
    
    @Test(priority=2)
    public void IsDisabled()
    {
    	BtnDisplayPage5 BtnDisplayPage=new BtnDisplayPage5(driver);
    	
    	//Verify that the button is disabled
    	Assert.assertFalse(BtnDisplayPage.Test5_Btn().isEnabled(),"Button should be disabled after Click and Message display");
    }
    
}
