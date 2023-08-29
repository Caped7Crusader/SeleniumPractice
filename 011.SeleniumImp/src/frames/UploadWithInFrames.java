package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadWithInFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.radpdf.com/demo/upload/");

		String path = "C://Users//dines//Downloads//c8f077d2-e6b1-4e85-88e5-932c6b115cae.pdf";
		driver.switchTo().frame("RadPdfMainContent_RadPdfDemoControl_PdfWebControl1");
//		driver.switchTo().frame("pdfe_uif");
//		WebElement upload = driver.findElement(By.xpath("//input[@type='submit']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement chooseFile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
		
		chooseFile.sendKeys(path);
//		upload.click();
		
	}

}
