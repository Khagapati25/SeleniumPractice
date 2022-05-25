package DropDown;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20Multiple%20listbox/MTR.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement mtrlist= driver.findElement(By.id("mtr"));
		
		Select s = new Select(mtrlist);
		List<WebElement> alloption = s.getOptions();
		
		HashSet<String> h = new HashSet<>();
		for(WebElement option:alloption)
		{
			String text = option.getText();
			if(h.add(text)==false)
			{
				System.out.println(text);
			}
		}
		driver.close();
	}

}
