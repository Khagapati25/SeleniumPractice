package HandlingPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();
		alrt.dismiss();
		Thread.sleep(2000);
		String text= driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.close();
	}
}

