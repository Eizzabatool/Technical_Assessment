package automation.TestFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.PageFiles.CellValuePage6;

/*
     Test Case 6
-Navigate to the home page
-Write a method that allows you to find the value of any cell on the grid
-Use the method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
-Assert that the value of the cell is "Ventosanzap"
 */

public class CellValueTest6 
{	
    WebDriver driver;
	
   @BeforeClass
	public void navigate() 	
	{	
    	driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP840/Downloads/QE-index.html");
	}
    
  
	@DataProvider(name = "cellDataProvider")
    public Object[][] cellDataProvider() {
        return new Object[][] {
            { 2, 2, "Ventosanzap" }
        };
    }
	
	@Test(dataProvider="cellDataProvider")
	public void VerifyCellValue(int row, int col, String expectedValue)
	{
		//Instantiating the Class
		CellValuePage6 CellValuePage=new CellValuePage6(driver);      
		String cell_value= CellValuePage.FindCellValue(row,col);
		
		//Verify that the text of the cell is as expected
		Assert.assertEquals(cell_value,expectedValue,"Value of the cell should be'Ventosanzap");

	}
	
	

	

	}








