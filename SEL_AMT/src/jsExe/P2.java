package jsExe;

import browsers.*;

import org.openqa.selenium.JavascriptExecutor;

public class P2 extends Launchers {
	
	public static void main(String[] args) {
		
		LaunchChrome("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) d;
		jse.executeAsyncScript("window.scrollBy(0,500)");
		
	}
	
}
