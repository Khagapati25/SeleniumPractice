package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsMTR {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20Multiple%20listbox/MTR.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement alloptions = driver.findElement(By.id("mtr"));
		Select s = new Select(alloptions);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		
		for (int i = 0; i < count; i++)
		{
			WebElement numb = options.get(i);
			String text =numb.getText();
			System.out.println(text);	
		}
		
		driver.close();
		
	}

}
