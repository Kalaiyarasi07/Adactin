package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException {
//WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\Datas.xlsx");
FileInputStream stream = new FileInputStream(file);
Workbook workbook = new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheet("Datas");
for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		CellType type = cell.getCellType();
		switch(type) {
			case STRING:
				String name = cell.getStringCellValue();
		System.out.println(name);
		break;
		
	case NUMERIC:
	
		if(DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			String format2 = format.format(date);
			System.out.println(format2);
			
		}
		else {
			double d = cell.getNumericCellValue();
			BigDecimal decimal = BigDecimal.valueOf(d);
			String string = decimal.toString();
			System.out.println(string);
		}
			
		}
  
		
	}




}

	}

}

	
		
