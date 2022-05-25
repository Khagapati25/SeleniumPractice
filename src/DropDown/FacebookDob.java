package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDob {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		
		WebElement DayList = driver.findElement(By.id("day"));
		Select s = new Select(DayList);
		s.selectByValue("25");
		Thread.sleep(4000);
		
		WebElement MonthList = driver.findElement(By.id("month"));
		Select s1 = new Select(MonthList);
		s1.selectByValue("12");
		Thread.sleep(4000);
		
		WebElement YearList = driver.findElement(By.id("year"));
		Select s2 = new Select(YearList);
		s2.selectByValue("1995");
		Thread.sleep(4000);
		
		driver.close();
	}
}
