package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotClass {
	
	public static void captureWindow(WebDriver d) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot) d;
		File source = ss.getScreenshotAs(OutputType.FILE);
		String fileName = "./" + LocalDateTime.now().getSecond() + ".png";
		System.out.println(fileName);
		File desinationFile = new File(fileName);
		FileUtils.copyFile(source, desinationFile);
		
	}
	
}
