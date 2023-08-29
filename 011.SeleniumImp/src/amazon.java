
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_k\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		

		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("watches" + Keys.ENTER);
		
		WebElement sortby = driver.findElement(By.xpath("//select[@name='s']"));
		Select highest = new Select(sortby);
		highest.selectByVisibleText("Price: High to Low");
		
//		WebElement highest = driver.findElement(By.xpath("//a[text()='Price: High to Low']"));
//		highest.click();
		WebElement item = driver.findElement(By.xpath("//div[@data-index='7']//a[@class='a-link-normal s-no-outline']"));
//		String value = item.getAttribute("title");
		item.click();
//		System.out.println(item.getText());
		
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

//		WebElement item = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
//		wait.until(ExpectedConditions.visibilityOf(item));
//		item.click();
	}

}
