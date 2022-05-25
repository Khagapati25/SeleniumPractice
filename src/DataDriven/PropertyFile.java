package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		
		driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
		
		driver.findElement(By.id("last")).click();
		
		
		
	}

}
