package suiteC;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassCC extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider="dataProviderSuiteC", groups= {"smoke", "sanity"})
	public void testCC(String arg1, String arg2) throws InterruptedException{
		log("Starting Test CC");
		log("Username: "+ arg1);
		log("Password: "+ arg2);
		Thread.sleep(3000);
		log("Ending Test CC");
	}
	
}
