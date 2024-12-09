package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	static ExtentReports extent;
	
	public static ExtentReports getReporter() {
		if(extent == null) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			spark.config().setDocumentTitle("My Sample Extent Report Doc Title");
			spark.config().setReportName("My Sample Extent Report Name");
			spark.config().setTheme(Theme.STANDARD);
			extent.attachReporter(spark);
		}
		
		return extent;
	}
	
}