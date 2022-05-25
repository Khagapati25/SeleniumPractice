package DropDown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20Multiple%20listbox/MTR.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		
		Select s= new Select(mtrlistbox);
		s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("dhosa");
		Thread.sleep(2000);
		
		if(s.isMultiple()==true)
		{
			s.deselectByVisibleText("dhosa");
			Thread.sleep(2000);
			s.deselectByIndex(1);
			Thread.sleep(2000);
			s.deselectByValue("1");
			Thread.sleep(2000);
		}
		
		driver.close();
		
	}
}
