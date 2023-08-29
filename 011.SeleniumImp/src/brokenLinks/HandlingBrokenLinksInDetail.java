package brokenLinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinksInDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUrl = "http://demo.guru99.com/test/newtours/";					
				
        WebDriver driver = new ChromeDriver();					
        		
        String underConsTitle = "Under Construction: Mercury Tours";					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));					
		driver.get(baseUrl);
		
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
		int	i = 0;					

			//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

//			//test each link		
//		for (String t : linkTexts) {							
//			driver.findElement(By.linkText(t)).click();					
//			if (driver.getTitle().equals(underConsTitle)) {							
//                System.out.println("\"" + t + "\""								
//                        + " is under construction.");			
//            } else {			
//                System.out.println("\"" + t + "\""								
//                        + " is working.");			
//            }		
//			driver.navigate().back();			
//        }
		for(String linkText : linkTexts) {
			System.out.println(linkText);
		}
		
		driver.quit();			
	}

}
