package suiteB;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassB extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="dataProviderSuiteB", groups="smoke")
	public void testB(String arg1, String arg2) throws InterruptedException{
		log("Starting Test B");
		log("Username: "+ arg1);
		log("Password: "+ arg2);
		Thread.sleep(3000);
		log("Ending Test B");
	}
}
