package suiteA;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassAA extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA", groups="sanity")
	public void testAA(String arg1, String arg2) throws InterruptedException{
		log("Starting Test AA");
		log("Username: "+ arg1);
		log("Password: "+ arg2);
		Thread.sleep(3000);
		log("Ending Test AA");
	}
	
}
