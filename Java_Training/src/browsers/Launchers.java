package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchers {
	
	protected static WebDriver d;
	
	public static void LaunchChrome(String url) {

		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void LaunchEdge(String url) {
		
		d = new EdgeDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void LaunchFirefox(String url) {
		
		d = new FirefoxDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void CloseLaunchers() {
		
		d.close();
		d.quit();
		
	}
	
}
