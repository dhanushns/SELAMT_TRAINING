package adv_features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.*;

public class Screenshot extends Helpers {
	
	public static void main(String[] args) throws IOException {
		
		LaunchChrome("https://www.saucedemo.com/");
		TakesScreenshot ss = (TakesScreenshot)d;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./error-1.png");
		FileUtils.copyFile(src, destFile);
		
	}
	
}
