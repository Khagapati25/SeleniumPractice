package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllwindowTitle {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
//		String title1 = driver.getTitle();   
//		System.out.println(title1);            //for single window title.
		
		int count= allwindows.size();
		System.out.println("Total Windows are: "+count);
		
		for(String windows: allwindows)         //for all window titles.
		{
			driver.switchTo().window(windows);
			String title = driver.getTitle();
			System.out.println("Title of the browser is: "+title);
			
		}
		
		Thread.sleep(4000);
		driver.quit();
	}

}
