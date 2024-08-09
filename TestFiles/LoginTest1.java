package automation.TestFiles;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automation.PageFiles.LoginPage1;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertNotNull;



/*
     Test Case 1
-Navigate to the home page
-Assert that both the email address and password inputs are present 
as well as the login button
-Enter in an email address and password combination into the respective fields
*/

public class LoginTest1 
{
	WebDriver driver; 
	
        @BeforeClass
		public void navigate() 
        {   	
          driver= new ChromeDriver();
		  driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
		}
        
        @Test(priority=1)
        public void verifyElements() 
        {
        	// Instantiating the class
            LoginPage1 LoginPage=new LoginPage1(driver);
            
		   //Assert the Elements (Email Input, Password input, Sign-In Button)		    
            assertNotNull(LoginPage.Email_Element(),"Email input should be present");
		    assertNotNull(LoginPage.Password_Element(),"Password input should be present");
		    assertNotNull(LoginPage.LoginBtn_Element(),"SignIn Button should be present");
		    
		   // Entering Credentials
		    LoginPage.Email_Element().sendKeys("Admin@gmail.com");
		    LoginPage.Password_Element().sendKeys("Admin");
		    LoginPage.LoginBtn_Element().click();
          }
}
