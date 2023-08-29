package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBrokenLinks {
	
	public static void verifyLink(String url) {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
			httpURLConnection.setConnectTimeout(1000);
//			httpURLConnection.setRequestMethod("HEAD");  //we can only get head not body so that it is fast
			httpURLConnection.connect(); 
			
			if(httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			}else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			
		}catch(Exception e) {
			System.out.println(url + " - " + "is a broken link");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

	}

}
