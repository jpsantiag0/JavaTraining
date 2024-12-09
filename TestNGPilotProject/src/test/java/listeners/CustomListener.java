package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("****** TEST SUCCESS *****");
		ExtentTest test = (ExtentTest) result.getAttribute("reporterObject");
		test.info("Test Name via test.info(): " + result.getName());
		test.pass("Test Case Succeeded");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("****** TEST FAILURE *****");
		ExtentTest test = (ExtentTest) result.getAttribute("reporterObject");
		test.log(Status.INFO, "Test Name via test.log(): " + result.getName());
		test.fail("Failure: " + result.getThrowable().getMessage());
	}
	
}
