package utilities;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import testsPOM.*;

public class ListenerLog extends Test1 implements ITestListener{
	
	Logger log = LogManager.getLogger(ListenerLog.class);
	
	@Override
	public void onTestStart(ITestResult result) {
		
		BasicConfigurator.configure();
		log.info("Log4j Configured Successfully");
		Reporter.log("Test started : " + result.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed : " + result.getName());
		
		try {
			TakeScreenshotClass.captureWindow(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
