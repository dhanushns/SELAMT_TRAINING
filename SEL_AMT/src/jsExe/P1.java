package jsExe;

import browsers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P1 extends Launchers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://www.saucedemo.com/");
		JavascriptExecutor jse = (JavascriptExecutor) d;
		WebElement we1 = d.findElement(By.id("user-name"));
		WebElement we2 = d.findElement(By.id("password"));
		WebElement we3 = d.findElement(By.id("login-button"));
		
		jse.executeScript("arguments[0].value='standard_user', arguments[1].value = 'secret_sauce'",we1,we2);
		jse.executeScript("arguments[0].click();", we3);
		
	}
	
}
