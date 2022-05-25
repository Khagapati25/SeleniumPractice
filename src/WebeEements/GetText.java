package WebeEements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
		
		String text = driver.findElement(By.linkText("Today's Deals")).getText(); 
		
		// or
		//WebElement ele=  driver.findElement(By.linkText("Today's Deals"));
		//String text =ele.getText();
		
		System.out.println("Text is : " +text);
		
		if(text.equals("Today's Deals"))
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
