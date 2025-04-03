package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import testsPOM.*;

public class ListenerClass extends Test1 implements ITestListener{
	
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
