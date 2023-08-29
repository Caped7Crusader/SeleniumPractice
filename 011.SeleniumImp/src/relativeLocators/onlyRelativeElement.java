package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class onlyRelativeElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBar.sendKeys("relative locators");
		Thread.sleep(5000);
//		driver.findElement(By.name("btnK")).click();
		
		WebElement search = driver.findElement(RelativeLocator.with(By.name("btnK")).toLeftOf(By.name("btnI")));

		search.click();
	}

}
