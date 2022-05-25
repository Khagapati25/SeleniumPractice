package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
		Thread.sleep(4000);
		
		List<WebElement> allsuggestsions = driver.findElements(By.xpath("//li[@class='sbct']"));
		int size = allsuggestsions.size();
		System.out.println("The size of auto suggestion is: "+size);
		
		for(WebElement suggestsion: allsuggestsions)
		{
			System.out.println(suggestsion.getText());
			
		}
		driver.close();
		
	}
}
