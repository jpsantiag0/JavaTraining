package testNGExtent;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentReportManager;

public class RegistrationTest {
	ExtentReports extent;
	ExtentTest extentTest;
	
	@BeforeMethod
	public void init() {
		extent = ExtentReportManager.getReporter();

		extentTest = extent.createTest("Facebook Registration Test");
	}
	
	
	@AfterMethod
	public void quit() {
		extent.flush();
	}

	@Test
	public void registrationTest() {
		extentTest.info("Entering User Name");
		extentTest.info("Entering Password");
		extentTest.info("Confirming Password");
		extentTest.info("Clicking register button");
		extentTest.pass("Test Succeeded...");

		
	}
}
