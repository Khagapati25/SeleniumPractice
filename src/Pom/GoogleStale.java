package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStale {
	
	@FindBy(name="q")
	private WebElement searchText;
	
	
	public GoogleStale(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	public void search(String sr) {
		searchText.sendKeys(sr);	
	}

}
