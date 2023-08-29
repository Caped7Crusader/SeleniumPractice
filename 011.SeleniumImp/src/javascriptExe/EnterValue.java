package javascriptExe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement newTour = driver.findElement(By.xpath("//a[text()='New Tours']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='abc'", email);
		jse.executeScript("arguments[0].click()", submit);
		jse.executeScript("arguments[0].click()", newTour);
//		submit.click();

	}

}
