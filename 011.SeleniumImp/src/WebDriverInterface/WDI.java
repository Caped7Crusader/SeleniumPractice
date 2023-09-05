package WebDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class WDI {
	
	public static String browser = "FireFox"; //getting browser form excelSheet at runtime
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(browser.equals("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equals("FireFox")){
//			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}

		driver.get("http://www.cricbuzz.com/");
	}

}
