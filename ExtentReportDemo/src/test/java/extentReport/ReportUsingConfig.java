package extentReport;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUsingConfig {
	
	@Test
	public void sampleReportJson() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("my_sample_JSON_extent_report.html");
        final File CONF = new File("extentConfig.json");
        
        spark.loadJSONConfig(CONF);
        
//        spark.config().setDocumentTitle("My Sample Extent Report Doc Title");
//        spark.config().setReportName("My Sample Extent Report Name");
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
        
        extent.flush();
	}
	
	@Test
	public void sampleReportXml() throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("my_sample_XML_extent_report.html");
        final File CONF = new File("extentConfig.xml");
        
        spark.loadXMLConfig(CONF);
        
//        spark.config().setDocumentTitle("My Sample Extent Report Doc Title");
//        spark.config().setReportName("My Sample Extent Report Name");
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
        
        extent.flush();
	}
}
