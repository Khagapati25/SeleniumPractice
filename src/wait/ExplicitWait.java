package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement username = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		
		//driver.findElement(By.id("password")).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("admin");
		
		//driver.findElement(By.name("login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		
		driver.findElement(By.partialLinkText("Sales")).click();
	}

}
