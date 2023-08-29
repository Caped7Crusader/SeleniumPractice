package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']/tbody"));
	    int numRows = table1.findElements(By.tagName("tr")).size();
	    int numCols = table1.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size();

	    System.out.println(numRows +" " + numCols );
	    for (int row = 0; row < numRows; row++) {
	      for (int col = 0; col < numCols; col++) {
	        WebElement cell = table1.findElements(By.tagName("tr")).get(row).findElements(By.tagName("td")).get(col);
	        String cellValue = cell.getText();
	        System.out.println("Row " + (row + 1) + ", Column " + (col + 1) + ": " + cellValue);
	      }
	    }
	}

}
