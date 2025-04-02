package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helpers {
	
	protected static WebDriver d;
	private static FileInputStream file;
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	
	public static void LaunchChrome(String url) {

		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void LaunchEdge(String url) {
		
		d = new EdgeDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void LaunchFirefox(String url) {
		
		d = new FirefoxDriver();
		d.get(url);
		d.manage().window().maximize();
		
	}
	
	public static void CloseLaunchers() {
		
		d.quit();
		
	}
	
	public static void readFile(String filepath, String sheetName) throws IOException {
		
		file = new FileInputStream(filepath);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		
	}
	
	
	public static String readExcelCell(int row, int cell) throws IOException {
	
		XSSFRow r = sheet.getRow(row);
		
		return r.getCell(cell).getStringCellValue();
		
		
	}
	
}
