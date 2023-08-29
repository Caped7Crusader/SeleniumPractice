package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSpecificCellValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']/tbody"));

        // locate all rows of the table
        List<WebElement> rows = table1.findElements(By.xpath(".//tr"));

        // specify the row and column index
        int rowIndex = 3;
        int colIndex = 3;

        // locate the cell
        WebElement cell = rows.get(rowIndex - 1).findElements(By.xpath(".//td")).get(colIndex - 1);

        // retrieve the cell value
        String cellValue = cell.getText();
        System.out.println("Cell value: " + cellValue);


	    
	    //to get row 3 cell 3 value
	    System.out.println(table1.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(2).getText());
	}

}
