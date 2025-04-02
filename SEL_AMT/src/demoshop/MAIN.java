package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAIN {
	
	static WebDriver d = new ChromeDriver();
	
	public static void main(String[] args) {
		
		
		d.get("https://demowebshop.tricentis.com/");
		
		User user = new User("Senthil","K","senthil2@gmail.com","sen123","sen123",d);
		//user.register();
		user.login();
		//vote();
		user.purchaseBook("Fiction EX","3");
		
	}
	
	public static void vote() {
		
		// Community Pool
		d.findElement(By.id("pollanswers-2")).click();
		d.findElement(By.id("vote-poll-1")).click();
		if(d.findElement(By.className("poll-results")).isDisplayed()) {
			System.out.println("Voted Successfully in community poll");
		}
		else {
			System.out.println("The Expected Voting is not done");
		}
		
	}

}
