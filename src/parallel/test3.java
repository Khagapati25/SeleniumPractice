package parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void connectDb() {
		Reporter.log("-----Connect To DataBase", true);
	}
	
	@Parameters ({"browsername"})
	@BeforeMethod
	public void openApp(String browser){
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();	
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Reporter.log("Open the App",true);	
	}
	
	@Test
	public void testCase() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.id("last")).click();
		Reporter.log("Testing Login Page", true);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
		Reporter.log("Close the App", true);
	}
	
	@AfterSuite
	public void disconnectDb() {
		Reporter.log("-----Disonnect To DataBase", true);
	}

}
