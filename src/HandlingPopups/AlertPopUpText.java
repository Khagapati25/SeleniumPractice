package HandlingPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUpText {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alrt = driver.switchTo().alert();
		String preText=alrt.getText();
		System.out.println(preText);
		alrt.sendKeys("Thor");
		Thread.sleep(2000);
		alrt.accept();
		Thread.sleep(2000);
		String text= driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
		}

}
