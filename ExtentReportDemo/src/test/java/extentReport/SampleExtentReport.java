package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleExtentReport {
	
	@Test
	public void sampleReport() {
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("my_sample_extent_report.html");
        spark.config().setDocumentTitle("My Sample Extent Report Doc Title");
        spark.config().setReportName("My Sample Extent Report Name");
        spark.config().setTheme(Theme.STANDARD);
        extent.attachReporter(spark);


        ExtentTest extentTest = extent.createTest("Facebook Login Page");
        extentTest.info("Passing User Name");
        extentTest.info("Passing Password");
        extentTest.info("Clicking submit button");
        extentTest.pass("Test Succeeded...");
        
        
        ExtentTest homePageTest = extent.createTest("Facebook Home Page");
        homePageTest.pass("Entering to Facebook Home Page");
        homePageTest.info("Click on Profile");
        homePageTest.fail("Test Failed...");
    
        
//                .info("info")
//                .pass("pass")
//                .warning("warn")
//                .skip("skip")
//                .fail("fail");
        
        extent.flush();
	}

}
