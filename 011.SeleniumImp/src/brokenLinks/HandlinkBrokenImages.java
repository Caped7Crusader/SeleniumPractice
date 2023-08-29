package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinkBrokenImages {
	
	public static void verifyLink(String url) throws IOException {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
			httpURLConnection.setConnectTimeout(3000);
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
	
	private static void verifyImage(WebElement image, WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Boolean imageDisplayed = (Boolean) jse.executeScript("return (typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0);", image);

		if (imageDisplayed) {
            System.out.println("DISPLAY - OK");
        }else {
             System.out.println("DISPLAY - BROKEN");
        }
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
	
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		
		System.out.println(allImages.size());
		for(int i = 0; i < allImages.size(); i++) {
			WebElement image = allImages.get(i);
			String imageUrl = image.getAttribute("src");
			verifyLink(imageUrl);	
		}

		for(int i = 0; i < allImages.size(); i++) {
			WebElement image = allImages.get(i);
			verifyImage(image, driver);		
		}
		
	}

}
