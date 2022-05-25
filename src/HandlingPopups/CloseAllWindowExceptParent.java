package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowExceptParent {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String windows: allwindows)
		{
			driver.switchTo().window(windows);
			
			if(windows.equals(parent))
			{
				
			}
			else
			{
				driver.close();
			}
		}
	}
}
