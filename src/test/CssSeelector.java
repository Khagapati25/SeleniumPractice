package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSeelector {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(20000);
		
		driver.close();
	}
}
