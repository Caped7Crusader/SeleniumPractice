package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class extractingAllOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select dropDownSelect = new Select(dropDown);

		List <WebElement> op = dropDownSelect.getOptions();
	      
	      for(int i = 0; i < op.size(); i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}

}
