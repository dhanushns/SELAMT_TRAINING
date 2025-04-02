package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.*;

public class DragAndDrop extends Helpers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement we1 = d.findElement(By.id("draggable"));
		WebElement we2 = d.findElement(By.id("droppable"));
		Actions act = new Actions(d);
		act.dragAndDrop(we1, we2).perform();
		
	}
	
}
