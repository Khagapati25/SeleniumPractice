package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoMyntra {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwjZmTBhB4EiwAynRmD-3KPM5lrk16jJY8p25dkIvaV_4juR_kr9Ld-DzDNDp4pXxxwq3_OhoCsvgQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ele.sendKeys("shirt");
		Thread.sleep(4000);
		
		List<WebElement> allsuggestsions = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		int size = allsuggestsions.size();
		System.out.println("The size of auto suggestion is: "+size);
		
		for(WebElement suggestsion: allsuggestsions)
		{
			System.out.println(suggestsion.getText());
			
		}
		driver.close();
		
	}

}
