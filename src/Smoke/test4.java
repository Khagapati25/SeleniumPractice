package Smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test4 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeSuite (groups = "smoke")
	public void connectDb() {
		Reporter.log("-----Connect To DataBase", true);
	}
	
	@BeforeMethod  (groups = "smoke")
	public void openApp(){
       driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Reporter.log("Open the App",true);	
	}
	
	@Test  (groups = "smoke")
	public void testCase() {
		driver.findElement(By.id("em")).sendKeys("qwert1234");
		driver.findElement(By.id("password")).sendKeys("qwerty12345");
		driver.findElement(By.id("last")).click();
		Reporter.log("Testing Login Page", true);
	}
	
	@AfterMethod  (groups = "smoke")
	public void closeApp() {
		driver.close();
		Reporter.log("Close the App", true);
	}
	
	@AfterSuite  (groups = "smoke")
	public void disconnectDb() {
		Reporter.log("-----Disonnect To DataBase", true);
	}

}
