package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed : " + result.getName());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Success : " + result.getName());
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started : " + result.getName());
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Finished : " + context.getName());
		
	}

}
