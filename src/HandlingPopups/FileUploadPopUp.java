package HandlingPopups;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20html/fileupload.html");
		driver.manage().timeouts().implicitlyWait(6 , TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		File f = new File("./data/my cv01.pdf");
		String aPath = f.getAbsolutePath();
		
		driver.findElement(By.id("cv")).sendKeys(aPath);
		Thread.sleep(4000);
		
		driver.close();		
		
	}
}