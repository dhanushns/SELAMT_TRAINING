package com.selenium.mavenproject;

import java.io.IOException;

public class P2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.read_data();
		s.computeAvg();
		s.write_data();
	}

}
