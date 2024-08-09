package automation.PageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CellValuePage6 
{
  
	WebDriver driver;
	
	  //Constructor
		public CellValuePage6 (WebDriver driver) 
		{
			this.driver=driver;
		}
		
	  //Locator
		public By getCellLocator(int row, int col) {
		   return By.xpath("(//table/tbody/tr["+(row+1)+"]/td["+(col+1)+"])");
		}
		
		//Action method
    	public String FindCellValue(int row, int col)
		 {
			 WebElement cell=driver.findElement(getCellLocator( row,col));
		     return cell.getText();
		 }
}
