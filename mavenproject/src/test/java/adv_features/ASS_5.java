package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.*;

public class ASS_5 extends Helpers{
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://jqueryui.com/selectmenu/");
		d.switchTo().frame(0);
		WebElement s1 = d.findElement(By.cssSelector("select#speed"));
		WebElement s2 = d.findElement(By.cssSelector("select#files"));
		WebElement s3 = d.findElement(By.cssSelector("select#number"));
		WebElement s4 = d.findElement(By.cssSelector("select#salutation"));
		
		new Select(s1).selectByIndex(2);
		new Select(s2).selectByVisibleText("ui.jQuery.js");
		new Select(s3).selectByVisibleText("4");
		new Select(s4).selectByContainsVisibleText("Pro");
		
		CloseLaunchers();
		
	}
	
}
