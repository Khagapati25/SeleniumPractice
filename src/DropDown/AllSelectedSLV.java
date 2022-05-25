package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedSLV {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KHAGAPATI/Desktop/selenium%20Multiple%20listbox/SLV.html");
		
		driver.manage().timeouts().implicitlyWait(4 , TimeUnit.SECONDS);
		WebElement slvlist = driver.findElement(By.id("slv"));
		
		Select s = new Select(slvlist);
		
		List<WebElement> optionSelected = s.getAllSelectedOptions();
		int count = optionSelected.size();
		
		//using for loop
		for (int i = 0; i < count; i++)
		{
			WebElement numb= optionSelected.get(i);
			String text = numb.getText();
			System.out.println(text);
		}
		
		//using for each loop
//		for(WebElement options:optionSelected)
//		{
//			System.out.println(options.getText());
//		}
		
		 driver.close();
	}
		
}
