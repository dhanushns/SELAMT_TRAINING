package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class ASS_2 extends Helpers {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://practice.expandtesting.com/drag-and-drop");
		
		WebElement web1 = d.findElement(By.cssSelector("#dnd-columns #column-a"));
		WebElement web2 = d.findElement(By.cssSelector("#dnd-columns #column-b"));
		
		Actions action = new Actions(d);
		action.dragAndDrop(web1, web2).perform();
		
		CloseLaunchers();
		
	}
	
}
