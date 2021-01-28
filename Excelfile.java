
package com.Ecommerce.Ebay.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author lakshmi
 *
 */

public class Excelfile implements AutoConstant {
/**
 * 
 * @param sheetName
 * @param rownum
 * @param cellnum
 * @return
 * @throws EncryptedDocumentException
 * @throws InvalidFormatException
 * @throws IOException
 */
	public static String readExcel(String sheetName, int rownum, int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream f=new FileInputStream(ExcelFilePath);
		Workbook wb= WorkbookFactory.create(f);
		
		String excelValue=wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return excelValue;
		
		
	}
}
