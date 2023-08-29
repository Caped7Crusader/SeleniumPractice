package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement newTour = driver.findElement(By.xpath("//a[text()='New Tours']"));
		
		Actions  actions= new Actions(driver);
		Action capitalSendKeys = actions.moveToElement(email)
										.click()
										.keyDown(Keys.SHIFT)
										.sendKeys("hii")
										.keyUp(Keys.SHIFT)
										.build();
		capitalSendKeys.perform();
		
//		Actions hoverActions = new Actions(driver);
		Action hoverAction = actions.moveToElement(newTour).build();
	}

}
