package testNG;

import org.testng.annotations.Test;

import browsers.*;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;

public class LaunchBrowsers extends Launchers {
	
	String browser;
	
	LaunchBrowsers(String browser){
		
		this.browser = browser;
		
	}
	
	@Factory
	public static Object[] factory() {
		
		Object[] brw = {
				
				new LaunchBrowsers("Chrome"),
				new LaunchBrowsers("Edge"),
				new LaunchBrowsers("Firefox")
				
		};
		
		return brw;
		
	}
	
	@BeforeMethod
	public void getDrivers() {
		
		switch(browser) {
		
			case "Chrome" : LaunchChrome("https://www.saucedemo.com/");
			break;
			
			case "Edge" : LaunchEdge("https://www.saucedemo.com/");
			break;
			
			case "Firefox" : LaunchFirefox("https://www.saucedemo.com/");
			break;
		
		}
		
	}
	
	
	@Test
	public void test() {
		
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();
		
	}
	

}
