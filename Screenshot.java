package com.Ecommerce.Ebay.genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements AutoConstant{
	

	
	
	public static String getscreenshot(WebDriver browser, String tmethodName) throws IOException {
		Date d =new Date();
		String date=d.toString().replace(":", ",") +".png";
		TakesScreenshot t=	(TakesScreenshot)browser;
		File src=t.getScreenshotAs(OutputType.FILE);
		File des=new File(ScreenshotPath + date +tmethodName + ".png");
		FileUtils.copyFile(src, des);
		
		return date;
		
	}
	

	
	

}
