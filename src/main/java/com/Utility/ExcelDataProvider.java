package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public  ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_Framework\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		 wb=new XSSFWorkbook(fis);
			
	}
	
	public String getStrinData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
}
