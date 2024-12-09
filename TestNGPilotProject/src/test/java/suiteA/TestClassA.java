package suiteA;

import org.testng.annotations.Test;
import org.testng.Assert;

import dataprovider.TestDataProvider;
import testBase.TestBase;

public class TestClassA extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA", groups="smoke")
	public void testA(String arg1, String arg2) throws InterruptedException{
		log("Starting Test A");
		log("Username: "+ arg1);
		
		if(!arg1.equals("USERNAME_DEMO")) {
			softAssert("Username [" + arg1 + "] did not match [USERNAME_DEMO]");
		}
		
		// softAssert.assertEquals(arg1, "USERNAME_DEMO");
		
		log("Password: "+ arg2);
		
		if(!arg2.equals("PWD_DEMO")) {
			// softAssert("Password [" + arg2 + "] did not match [PWD_DEMO]");
			failAndStop("[Hard Stopper] Password doesn't match");
		}
		
		if(!arg2.equals("PWD_DEMO")) {
			softAssert("Password [" + arg2 + "] did not match [PWD_DEMO]");

		}
		
		//softAssert.assertEquals(arg2, "PWD_DEMO");
		Thread.sleep(3000);
		log("Ending Test A");
		softAssert.assertAll();
		// Assert.assertEquals(arg1, "USERNAME_DEMO");  //Hard stopper
	}
}
