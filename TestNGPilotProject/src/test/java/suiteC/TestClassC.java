package suiteC;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassC extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="dataProviderSuiteC", groups="smoke")
	public void testC(String arg1, String arg2) throws InterruptedException{
		log("Starting Test C");
		log("Username: "+ arg1);
		log("Password: "+ arg2);
		Thread.sleep(3000);
		log("Ending Test C");
	}
}
