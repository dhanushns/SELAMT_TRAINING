package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class KeyboardFunctions extends Helpers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://www.saucedemo.com/");
		WebElement we1 = d.findElement(By.id("user-name"));
		Actions act = new Actions(d);
		act.sendKeys(we1, "Dhanush ").keyDown(Keys.CONTROL).sendKeys("acvv").keyUp(Keys.CONTROL).perform();
		
	}
	
}
