package syncronizations;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import browsers.*;

public class ASS_3 extends Launchers {
	
	public static void main(String[] args) throws InterruptedException {
		
		LaunchChrome("https://the-internet.herokuapp.com/dynamic_controls");
		d.findElement(By.cssSelector("form#input-example button")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);
		WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form#input-example input")));
		inputElement.sendKeys("Selenium");
		
		CloseLaunchers();
		
	}
	
}
