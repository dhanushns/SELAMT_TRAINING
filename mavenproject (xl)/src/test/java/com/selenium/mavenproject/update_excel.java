package com.selenium.mavenproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class update_excel {
	
	public static void excel_update() throws IOException {
		
		String filename = "testdata.xlsx";
		
		FileInputStream file = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow r = sheet.getRow(0);
		XSSFCell c = r.getCell(1);
		c.setCellValue("Mphasis");
		
		System.out.println("Cell updated to : " + c.getStringCellValue());
		
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		
		
	}
	
}
