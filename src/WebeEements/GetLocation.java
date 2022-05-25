package WebeEements;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
		
		//FOR EMAIL FIELD
		WebElement ele1 =driver.findElement(By.xpath("//input[@name='email']"));
		
//		int x = button.getLocation().getX();
//		System.out.println("X-axis location is: "+ x);
//		
//		int y = button.getLocation().getY();
//		System.out.println("Y-axis location is: "+ y);
		
		//or
		
		//FOR TEXT FIELD
		Point loc1 = ele1.getLocation();
		int x1 = loc1.getX();
		System.out.println("X-axis location for email is: "+ x1);
		
		int y1 = loc1.getY();
		System.out.println("Y-axis location for email is: "+ y1);
		
		//FOR PASSWORD FIELD
		WebElement ele2 =driver.findElement(By.xpath("//input[@name='pass']"));
		
		Point loc2 = ele2.getLocation();
		int x2 = loc2.getX();
		System.out.println("X-axis location for password is: "+ x2);
		
		int y2 = loc2.getY();
		System.out.println("Y-axis location for password is: "+ y2);
		
		//VERIFICATION X-AXIS
		if(x1==x2)
		{
			System.out.println("X-axis matches, test is Passed");
		}
		
		else
		{
			System.out.println("X-axis mis-matches, test is Failed");
		}
		
		//VERIFICATION Y-AXIS
		if(y1==y2)
		{
			System.out.println("Y-axis matches, test is Passed");
		}
		
		else
		{
			System.out.println("Y-axis mis-matches, test is Failed");
		}
		
		
		driver.close();
	}
}
