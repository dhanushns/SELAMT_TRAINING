package adv_features;

import java.awt.AWTException;
import java.awt.Robot;

import utilities.*;

public class WindowsBasedPopup extends Helpers{
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		LaunchChrome("https://saucedemo.com");
		Robot r = new Robot();
		Thread.sleep(2000);
		r.mouseMove(500, 500);
		
	}
	
}
