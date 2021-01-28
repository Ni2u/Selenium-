package com.Ecommerce.Ebay.genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * 
 * @author lakshmi
 *
 */
public class TestBasis extends Screenshot implements AutoConstant   {
	/**
	 *  Open the application 
	 */
	
	WebDriver browser;
	
	@BeforeMethod
	/**
	 * 
	 * @throws IOException
	 */
	
	public void openApp() throws IOException {
		
		System.setProperty(driverKey, driverValue);
		browser=new ChromeDriver();
		
		browser.get(Propertyfile.readProperty("url"));
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	/**
	 * close the browser
	 */
	
	
	public void closeApp(ITestResult r ) throws IOException {
		
		int status =r.getStatus();
		String tMethodName=r.getTestName();
		
		if(status==2) {
			Screenshot.getscreenshot(browser, tMethodName);
		}
		
		browser.close();
		
	}

}
