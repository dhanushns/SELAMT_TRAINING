package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

import utilities.*;

public class RelativeLocators extends Helpers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LaunchChrome("https://www.saucedemo.com/");
		
		By usernameLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		d.findElement(usernameLocator).sendKeys("standard_user");
		
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		d.findElement(passwordLocator).sendKeys("secret_sauce");
		
		
	}

}
