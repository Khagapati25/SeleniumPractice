package HandlingPopups;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopUpCareInsurance {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(6 , TimeUnit.SECONDS);
		
		driver.findElement(By.name("policynumber")).sendKeys("11223344");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s = new Select(month);
		s.selectByVisibleText("Jun");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("2020");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='20']")).click();
		
		driver.findElement(By.name("alternative_number")).sendKeys("8976543210");
		Thread.sleep(2000);
		
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		
		String text= driver.findElement(By.xpath("//p[contains(text(),'Your policy has lapsed')]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		}
}
