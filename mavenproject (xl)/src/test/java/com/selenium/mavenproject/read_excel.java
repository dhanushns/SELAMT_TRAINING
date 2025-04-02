package com.selenium.mavenproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel {
	
	int lastrownum, lastcellnum;
	
	public static String excel_read() throws IOException{
		
		String filename = "testdata.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fil = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fil);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		XSSFRow row = sh.getRow(0);
		XSSFCell cell = row.getCell(0);
		return cell.getStringCellValue();
		
	}
	
}
