package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTableAndPrintCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']/tbody"));
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));
					for (WebElement cell : cells) {
						System.out.println(cell.getText());
					}
		}

	}

}
