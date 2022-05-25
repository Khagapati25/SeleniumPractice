package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//switching frame 1 to frame 2 and sending keys
public class Frame {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20html/New%20folder/demoFrame.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("t2")).sendKeys("d");
		
		
		}

}
