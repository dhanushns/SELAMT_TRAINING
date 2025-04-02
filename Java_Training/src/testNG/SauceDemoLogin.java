package testNG;
import org.openqa.selenium.By;

import browsers.*;
public class SauceDemoLogin extends Launchers {
	
	public void login() {
		
		LaunchChrome("https://www.saucedemo.com/");
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();
		
	}
	
}
