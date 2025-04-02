package com.selenium.mavenproject;

import java.io.IOException;

public class P1{
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(read_excel.excel_read());
		update_excel.excel_update();
		write_excel.excel_write();
		
	}
	
}