package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadData {

	public static void main(String[] args) throws IOException {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\Datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
	
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
			
		}
		
		
		}		

	}

}
