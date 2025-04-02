package syncronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browsers.*;

public class ASS_1 extends Launchers {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://the-internet.herokuapp.com/dynamic_controls");
		d.findElement(By.cssSelector("form#checkbox-example button")).click();
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(5));
		WebElement addButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form#checkbox-example button")));
		addButtonElement.click();
		
		WebElement checkBoxElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div input#checkbox")));
		System.out.println("Check box is displayed : " + checkBoxElement.isDisplayed());
		checkBoxElement.click();
		
		CloseLaunchers();
		
	}
	
}
