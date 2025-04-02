package com.selenium.mavenproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_excel {
	
	public static void excel_write() throws IOException {
		
		String filename = "testdata.xlsx";
		
		FileInputStream file = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow r = sheet.getRow(0);
		XSSFCell c = r.createCell(3);
		c.setCellValue("TestNG");
		
		System.out.println("Cell updated to : " + c.getStringCellValue());
		
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		
		
	}
	
}
