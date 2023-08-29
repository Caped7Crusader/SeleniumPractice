package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		WebElement dropDown = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		dropDown.click();
		Thread.sleep(4000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//button[@class='dropbtn']/following-sibling::div/a"));
		for(WebElement option : allOptions) {
			String optionAttribute = option.getAttribute("innerHTML");
			if(optionAttribute.contentEquals("Gmail")) {
				option.click();
			}
			System.out.println(optionAttribute);
			System.out.println(option.getText());
		}
	}

}
