package syncronizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uc {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver ch = new ChromeDriver();
		
		ch.get("https://practice.expandtesting.com/slow");
		
		Thread.sleep(11000);
		
		System.out.println(ch.findElement(By.xpath("//p[@class = \"alert alert-info\"]/strong")).getText());
		
	}
	
}
