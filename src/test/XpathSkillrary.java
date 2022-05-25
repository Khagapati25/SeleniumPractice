package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSkillrary {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("title is: " +title);
		
		
		if (title.equals("SkillRary Ecommerce"))
		{
			System.out.println("Test is Passed");
		}
		
		else
		{
			System.out.println("Test is Failed");
		}
		
		driver.close();
		
	}

}
