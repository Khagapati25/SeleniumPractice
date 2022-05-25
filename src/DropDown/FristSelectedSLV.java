package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FristSelectedSLV {
	
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
		
		WebElement optionSelected = s.getFirstSelectedOption();
		String text = optionSelected.getText();
		System.out.println("The First Selected Option is: "+text);
		
		driver.close();
		
	}
}
