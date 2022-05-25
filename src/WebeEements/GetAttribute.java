package WebeEements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.xpath("//input[@name='email']"));
		
		String attribute = ele.getAttribute("id");
		System.out.println("The attribute value of id is: "+attribute);
		
		if(attribute.equals("email"))
		{
			System.out.println("Test is Passed");
		}
		
		else {
			System.out.println("Test is Failed");
		}
		
		driver.close();
	}
}
