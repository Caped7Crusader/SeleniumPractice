package waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	
		WebElement dropDown = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		dropDown.click();

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 500 milliseconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']/following-sibling::div/a")));
  
		

	}

}
