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

public class FluentWaitMethod extends Launchers{
	
	public static void main(String[] args) {
		
		LaunchChrome("https://practice.expandtesting.com/slow");
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(12)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement we = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class = 'alrt alert-info']/strong")));
		
		System.out.println(we.getText());
		
		
	}
	
}
