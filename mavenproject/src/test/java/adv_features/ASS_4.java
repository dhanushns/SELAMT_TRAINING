package adv_features;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utilities.*;

public class ASS_4 extends Helpers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LaunchChrome("https://practice.expandtesting.com/slow");
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(d).withTimeout(Duration.ofMillis(500)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		WebElement we = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class = 'alert alert-info']/strong")));
		
		System.out.println(we.getText());
		
		CloseLaunchers();
		
	}

}
