package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3)
	public void whatsAppcall() {
		Reporter.log("whatsapp calling", true);
	}
	
	@Test (priority = 4 , enabled = false)
	public void whatsAppPayment() {
		Reporter.log("whatsapp payment", true);
	}
	
	@Test (priority = 1 , invocationCount = 3)
	public void whatsAppMessage() {
		Reporter.log("whatsapp message", true);
	}
		
		@Test (priority = 2)
		public void whatsAppStatus() {
			Reporter.log("whatsapp status", true);
		}
	}

