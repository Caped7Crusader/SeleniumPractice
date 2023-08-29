package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disappearingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.className("_3704LK"));
		search.sendKeys("shoes");
		search.click();
		WebElement womenShoes = driver.findElement(By.className("lrtEPN _17d0yO"));
		womenShoes.click();
		
//		setTimeout(function(){debugger;}, 5000);
//		or
//		RC > Inspect > Source > f8 or ctrl+\
	}

}
