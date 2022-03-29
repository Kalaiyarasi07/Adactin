package org.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	public void getDriver(String browerName) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
public WebElement findElement(String locatorType, String value) {
WebElement element = null;
	switch(locatorType) {
	case "id":
		element = driver.findElement(By.id(value));
		break;
	case "name":
		element = driver.findElement(By.name(value));
		break;
	case "xpath":
		element = driver.findElement(By.xpath(value));
		break;
	default:
			System.out.println("invalid locator");
			break;
}
return element;
}
public void getUrl(String url) {
	driver.get(url);
}
public String getDataFromExcel(int rowNum, int cellNum) throws IOException{
	File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\Adactin.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("datas");
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	CellType type = cell.getCellType();
	String value="";
	switch(type) {
	case STRING:
		 value = cell.getStringCellValue();
		 break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
			value = dateFormat.format(date);
		}
		else {
			double d = cell.getNumericCellValue();
			BigDecimal b = BigDecimal.valueOf(d);
			 value = b.toString();
			 }
		break;
		default:
			System.out.println("Some unidentified data in Excel");
			break;
	}
	return value;
}
public void writeDataToExcel(int rowNum, int cellNum, String value) throws IOException {
	File writefile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\order.xlsx");
	Workbook workbook = new XSSFWorkbook();
	Sheet sheet = workbook.createSheet();
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue(value);
	FileOutputStream out = new FileOutputStream(writefile);
	workbook.write(out);
}

}		
				
				
				
				
				
				
				



	


