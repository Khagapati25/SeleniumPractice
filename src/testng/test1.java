package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  
	@Test
	public void demo() {
		System.out.println("Hi");
		Reporter.log("Hello", true);
		Reporter.log("Welcome", false);
	}
}
