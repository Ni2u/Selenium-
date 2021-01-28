package com.Ecommerce.Ebay.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author lakshmi
 *
 */

public class Propertyfile implements AutoConstant {
	/**
	 * 
	 * @param propKey
	 * @return 
	 * @throws IOException
	 */
	public static String readProperty(String propKey) throws IOException
	
	{
		
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(PropertyFilePath);
		p.load(f);
		String propValue=p.getProperty(propKey);
		return propValue;
		
		
		
	}
	

}
