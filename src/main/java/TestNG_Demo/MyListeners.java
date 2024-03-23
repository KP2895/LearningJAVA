package TestNG_Demo;
//ITestLiestner is an interface which impliments all listners


import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase successful");
		
	}

	public void onTestFailure(ITestResult result) {
	
		System.out.println("Failure in testcase");
		System.out.println(result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	}