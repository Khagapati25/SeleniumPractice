package WebeEements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(By.xpath("//input[@name='email']"));
		
		int unheight = ele.getSize().getHeight();
		System.out.println("Height of the element is: "+unheight);
		
		int unwidth = ele.getSize().getWidth();
		System.out.println("width of the element is: "+unwidth);
		
		WebElement ele2 =driver.findElement(By.xpath("//input[@name='pass']"));
		int pwheight = ele2.getSize().getHeight();
		System.out.println("Height of the element is: "+pwheight);
		
		int pwwidth = ele2.getSize().getWidth();
		System.out.println("width of the element is: "+pwwidth);
		// or
		
//		Dimension unsize = ele.getSize();
//		int unheight = unsize.getHeight();
//		System.out.println("Height of the UserName element is: "+unheight);
//		int unwidth = unsize.getWidth();
//		System.out.println("width of the UserName element is: "+unwidth);
//		
//		WebElement ele2 =driver.findElement(By.xpath("//input[@name='pass']"));
//		Dimension pwsize = ele2.getSize();
//		int pwheight = pwsize.getHeight();
//		System.out.println("Height of the Passwore element is: "+pwheight);
//		int pwwidth = pwsize.getWidth();
//		System.out.println("Width of the Password element is: "+pwwidth);
		
		driver.close();
	}

}
