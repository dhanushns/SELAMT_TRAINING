package com.selenium.mavenproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Student {
	
	private int sid, m1,m2;
	private double avg;
	
	private final String filename = "studentData.xlsx";
	private HashMap<Integer,Student> student = new HashMap<>();
	
	Student(int sid,int m1, int m2){
		
		this.sid = sid;
		this.m1 = m1;
		this.m2 = m2;
		
	}
	
	Student(){}
	
	public void read_data() throws IOException {
		
		FileInputStream file = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet s1 = wb.getSheet("Sheet1");
		XSSFRow r;
		for(int i = 2; i <= 4; i++) {
			
			r = s1.getRow(i);
			int id  = (int) r.getCell(1).getNumericCellValue();
			int m1 = (int) r.getCell(2).getNumericCellValue();
			int m2 = (int) r.getCell(3).getNumericCellValue();
			
			student.put(id, new Student(id,m1,m2));
			
		} 
		
	}
	
	public void computeAvg() {
		
		for(Entry<Integer,Student> e : student.entrySet()) {
			
			Student s = e.getValue();
			double res = (s.m1 + s.m2)/2;
			s.avg = res;
			
		}
		
	}
	
	public void write_data() throws IOException {
		
		FileInputStream file = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet s2 = wb.getSheet("Sheet2");
		
		XSSFRow r;
		
		for(int i = 2; i <= 4; i++) {
			
			r = s2.getRow(i);
			int id = (int) r.getCell(1).getNumericCellValue();
			r.getCell(4).setCellValue(student.get(id).avg);
			System.out.println("Avg updated");
			System.out.println("Id : " + id);
			System.out.println("Name : " + r.getCell(2).getStringCellValue());
			System.out.println("Sem : " + r.getCell(3).getStringCellValue());
			System.out.println("Avg : " + r.getCell(4).getNumericCellValue());
			System.out.println();
		}
		
		FileOutputStream fo = new FileOutputStream(filename);
		wb.write(fo);
		wb.close();
		
	}
	
	
}
