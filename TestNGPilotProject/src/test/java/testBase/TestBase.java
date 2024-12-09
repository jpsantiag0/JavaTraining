package testBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReportManager;

public class TestBase {
	
	public ExtentReports report;
	public ExtentTest test;
	public SoftAssert softAssert;
	
	@BeforeMethod(alwaysRun=true)
	public void init(ITestResult result) {
		report = ExtentReportManager.getReporter();
		test = report.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("reporterObject", test);
		softAssert = new SoftAssert();
	}
	
	@AfterMethod(alwaysRun=true)
	public void quit() {
		report.flush();
	}
	
	public void log(String msg) {
		System.out.println(msg);
		test.info(msg);
	}
	
	public void pass(String msg) {
		System.out.println(msg);
		test.pass(msg);
	}
	
	public void fail(String msg) {
		System.out.println(msg);
		test.fail(msg);
	}
	
	public void skip(String msg) {
		System.out.println(msg);
		test.skip(msg);
	}
	
	public void softAssert(String msg) {
		fail(msg);
		softAssert.fail(msg);
	}
	
	public void failAndStop(String msg) {
		fail(msg);
		softAssert.assertAll();
	}
}
