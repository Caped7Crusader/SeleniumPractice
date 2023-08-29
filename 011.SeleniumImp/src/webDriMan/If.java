package webDriMan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 0;
//		if(i <= 5) {
//			System.out.println(i);
//			i++;
//		}
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_k\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.airbnb.co.in/?locale=en&_set_bev_on_new_domain=1679155313_NWI0MGU5MzFhMGZh");
		
		WebElement search = driver.findElement(By.xpath("//div[@class='s1qcpybl dir dir-ltr']"));
		search.click();
	}

}
