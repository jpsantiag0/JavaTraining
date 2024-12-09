package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FailedTestReport {
	
	@Test
	public void sampleReport() {
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("fullReport-index.html");
        spark.config().setDocumentTitle("My Full Extent Report Doc Title");
        spark.config().setReportName("My Full Extent Report Name");
        spark.config().setTheme(Theme.STANDARD);
        
        
        ExtentSparkReporter failedTestSpark = new ExtentSparkReporter("failedReport-index.html").filter().
        		statusFilter().
        		as(new Status[] {Status.FAIL, Status.SKIP}).
        		apply();
        failedTestSpark.config().setDocumentTitle("My Only-Failed Extent Report Doc Title");
        failedTestSpark.config().setReportName("My Only-Failed Extent Report Name");
        failedTestSpark.config().setTheme(Theme.STANDARD);
        
        
        
        extent.attachReporter(spark, failedTestSpark);


        ExtentTest extentTest = extent.createTest("Facebook Login with Valid Creds Test");
        extentTest.info("Passing User Name");
        extentTest.info("Passing Correct Password");
        extentTest.info("Clicking submit button");
        extentTest.pass("Test Succeeded...");
        
        
        ExtentTest homePageTest = extent.createTest("Facebook Home Page Test");
        homePageTest.pass("Entering to Facebook Home Page");
        homePageTest.info("Click on Profile");
        homePageTest.fail("Test Failed...");
        
        
        ExtentTest loginWithInvalidCredsTest = extent.createTest("Facebook Login with Invalid Creds Test");
        loginWithInvalidCredsTest.info("Passing User Name");
        loginWithInvalidCredsTest.info("Passing Incorrect Password");
        loginWithInvalidCredsTest.info("Clicking submit button");
        loginWithInvalidCredsTest.fail("Test Failed...");
        
        ExtentTest profileTest = extent.createTest("Facebook Profile Page Test");
        profileTest.pass("Entering to Facebook Home Page");
        profileTest.info("Click on Profile");
        profileTest.pass("Test Succeeded...");
        
        ExtentTest timelineTest = extent.createTest("Facebook Timeline Page Test");
        timelineTest.info("Passing User Name");
        timelineTest.info("Passing Password");
        timelineTest.info("Clicking submit button");
        timelineTest.skip("Test Skipped...");
    
        
        
        extent.flush();
	}
}
