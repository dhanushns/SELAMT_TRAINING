package adv_features;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class ASS_1 extends Helpers {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchFirefox("https://practice.expandtesting.com/context-menu");
		Actions action = new Actions(d);
		WebElement contextBox = d.findElement(By.cssSelector("#hot-spot"));
		action.contextClick(contextBox).perform();
		
		Alert alert = d.switchTo().alert();
		System.out.println("Alter Box Message : " + alert.getText());
		alert.accept();
		
		CloseLaunchers();
		
	}
	
}
