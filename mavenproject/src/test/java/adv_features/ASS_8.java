
package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.*;

public class ASS_8 extends Helpers{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LaunchChrome("https://www.saucedemo.com/");
		JavascriptExecutor exe = (JavascriptExecutor) d;
		
		WebElement userName = d.findElement(By.id("user-name"));
		WebElement pwd = d.findElement(By.id("password"));
		WebElement login = d.findElement(By.name("login-button"));
		
		exe.executeScript("arguments[0].value='standard_user', arguments[1].value = 'secret_sauce', arguments[2].click()",userName, pwd, login);
		
		
		//CloseLaunchers();
		
	}

}
