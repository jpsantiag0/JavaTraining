package testNGExtent;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentReportManager;

public class LoginTest {
	
	ExtentReports extent;
	ExtentTest extentTest;
	
	@BeforeMethod
	public void init() {
		extent = ExtentReportManager.getReporter();

		extentTest = extent.createTest("Facebook Login Page");
	}
	
	
	@AfterMethod
	public void quit() {
		extent.flush();
	}

	@Test
	public void sampleReport() {

		extentTest.info("Passing User Name");
		extentTest.info("Passing Password");
		extentTest.info("Clicking submit button");
		extentTest.fail("Validation Failed");
		AssertJUnit.assertEquals("Facebook Login Page", "Facebook Home Page");
		extentTest.fail("Test Failed...");

		
	}

}
