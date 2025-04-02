package stepdef_2;

import org.openqa.selenium.By;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.*;

public class Hooks extends Helpers {
	
	@Before
	public void openBrowser() {
		
		//System.out.println("Opening the Browser");
		//LaunchChrome("https://demowebshop.tricentis.com/");
		//d.findElement(By.linkText("Log in")).click();
	}
	
	@After
	public void closeBrowser() {
		
		//System.out.println("Closing the browser");
		//CloseLaunchers();
		
	}
	
}
