package suiteB;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassBB extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="dataProviderSuiteB", groups="sanity")
	public void testBB(String arg1, String arg2) throws InterruptedException{
		log("Starting Test BB");
		log("Username: "+ arg1);
		log("Password: "+ arg2);
		Thread.sleep(3000);
		log("Ending Test BB");
	}
	
}
