package com.Ecommerce.Ebay.genericlibrary;
/**
 * 
 * @author lakshmi
 *
 */


public interface AutoConstant {
	
	/**
	 * key and value which are used in system.set property are stored here in variables
	 * Property file path and excel path also remains constant so just store them in  a variable
	 * Screenshots are always stored in a folder, store that path in a variable
	 */

	
String driverKey= "webdriver.chrome.driver";
String driverValue="./src/main/resources/chromedriver.exe";



String PropertyFilePath="./src/test/resources/data.properties";
String ExcelFilePath="./src/test/resources/Exceldata.xlsx";


String ScreenshotPath="./src/Screenshots/";


}
