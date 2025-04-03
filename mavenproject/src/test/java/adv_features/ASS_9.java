
package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class ASS_9 extends Helpers{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LaunchChrome("https://www.saucedemo.com/");
		
		WebElement userName = d.findElement(By.id("user-name"));
		
		Actions action = new Actions(d);
		action.keyDown(Keys.SHIFT).perform();
		action.sendKeys(userName, "username").perform();
		
		
		//CloseLaunchers();
		
	}

}
