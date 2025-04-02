package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		
		dr.manage().window().maximize();
		
		for(int i = 0; i < 3; i++) {
			dr.findElement(By.linkText("Click Here")).click();
		}
		
		for(String h : dr.getWindowHandles()) {
			
			dr.switchTo().window(h);
			System.out.println("Window Handle : " + h);
			System.out.println("Window title : " + dr.getTitle());
			System.out.println();
			
		}
		
	}

}
