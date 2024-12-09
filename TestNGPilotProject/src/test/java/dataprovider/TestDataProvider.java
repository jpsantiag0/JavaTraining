package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider
	public static Object[][] dataProviderSuiteA(Method method){
		System.out.println("Test Method Name: "+method.getName());
		
		Object data[][] = null;
		if(method.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1A";
			data[0][1] = "Password 1A";
			data[1][0] = "Username 2A";
			data[1][1] = "Password 2A";
			
		}else if (method.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1AA";
			data[0][1] = "Password 1AA";
			data[1][0] = "Username 2AA";
			data[1][1] = "Password 2AA";
		}
		
		return data;
		
	}
	
	@DataProvider
	public static Object[][] dataProviderSuiteB(Method method){
		System.out.println("Test Method Name: "+method.getName());
		
		Object data[][] = null;
		if(method.getName().toUpperCase().equals("TESTB")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1B";
			data[0][1] = "Password 1B";
			data[1][0] = "Username 2B";
			data[1][1] = "Password 2B";
			
		}else if (method.getName().toUpperCase().equals("TESTBB")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1BB";
			data[0][1] = "Password 1BB";
			data[1][0] = "Username 2BB";
			data[1][1] = "Password 2BB";
		}
		
		return data;
		
	}
	
	@DataProvider
	public static Object[][] dataProviderSuiteC(Method method){
		System.out.println("Test Method Name: "+method.getName());
		
		Object data[][] = null;
		if(method.getName().toUpperCase().equals("TESTC")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1C";
			data[0][1] = "Password 1C";
			data[1][0] = "Username 2C";
			data[1][1] = "Password 2C";
			
		}else if (method.getName().toUpperCase().equals("TESTCC")) {
			data = new Object[2][2];
			
			data[0][0] = "UserName 1CC";
			data[0][1] = "Password 1CC";
			data[1][0] = "Username 2CC";
			data[1][1] = "Password 2CC";
		}
		
		return data;
		
	}
}
