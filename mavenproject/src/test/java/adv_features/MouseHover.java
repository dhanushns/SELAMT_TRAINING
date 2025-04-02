package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class MouseHover extends Helpers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://www.myntra.com/");
		WebElement we1 = d.findElement(By.xpath("//div[@class = 'desktop-navLinks']/div[1]/div/a"));
		Actions act = new Actions(d);
		act.moveToElement(we1).perform();
		
		
	}
	
}
