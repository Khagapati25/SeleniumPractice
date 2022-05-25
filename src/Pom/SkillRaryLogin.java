package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLogin {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		
	
		//declaration
		@FindBy(id="email")
		private WebElement userName;
		
		@FindBy(id="password")
		private WebElement passWord;
		
		@FindBy(name="login")
		private WebElement loginButton;
		
		
		//initialization
		public SkillRaryLogin(WebDriver driver) {
			PageFactory.initElements(driver,  this);
		}
		
		
		//utilization
		public void un(String user) {
			userName.sendKeys(user);	
		}
		
		public void pw(String pass) {
			passWord.sendKeys(pass);	
		}
		
		public void ln()
		{
			loginButton.click();
		}
}
