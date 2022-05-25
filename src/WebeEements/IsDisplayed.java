package WebeEements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//username
		WebElement username =driver.findElement(By.id("username"));
		if(username.isDisplayed())
		{
			System.out.println("username isDisplayed");
			username.sendKeys("admin");	
		}
		Thread.sleep(2000);
		
		//password
		WebElement password = driver.findElement(By.name("pwd"));
		if(username.isDisplayed())
		{
			System.out.println("password isDisplayed");
			password.sendKeys("manager");	
		}
		Thread.sleep(2000);
		
		//checkbox
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("check box isSelected");
		}
		Thread.sleep(2000);
		
		//login
		WebElement login = driver.findElement(By.xpath("//div[text() = 'Login ']"));
		if (login.isEnabled())
		{
			System.out.println("login isEnabled");
			login.click();
		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
