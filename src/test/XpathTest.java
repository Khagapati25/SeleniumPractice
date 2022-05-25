package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("input[@type='text']")).sendKeys("spiderman");
		driver.findElement(By.xpath("input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("webshooter");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("button[@name='login']")).click() ;
		Thread.sleep(2000);
		
		driver.close();

	}

}
