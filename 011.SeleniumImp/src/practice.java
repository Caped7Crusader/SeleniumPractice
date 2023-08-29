import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		searchBar.sendKeys("viduthalai part-1", Keys.ENTER);
		WebElement wikiPage = driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Viduthalai_Part_1']"));
		wikiPage.click();

	}

}
