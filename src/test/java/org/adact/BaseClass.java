package org.adact;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public void getDriver(String browser) {
		if(browser.equals("chrome")) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	}

		else if (browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		else if (browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
			}
driver.manage().window().maximize();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public WebElement locator(String locatorType, String value) {
		WebElement element =null;
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
public String getDataFromExcel(int rowNum, int cellNum) throws IOException {
File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\Adactin.xlsx");
FileInputStream stream = new FileInputStream(file);
Workbook workbook = new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheet("datas");
Row row = sheet.getRow(rowNum);
Cell cell = row.getCell(cellNum);
CellType type = cell.getCellType();
String value= "";
switch(type) {
case STRING:
	 value = cell.getStringCellValue();
	 break;
case NUMERIC:
	if(DateUtil.isCellDateFormatted(cell)) {
		Date dcv = cell.getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
		 value = format.format(dcv);
	}
	else {
		double ncv = cell.getNumericCellValue();
	BigDecimal decimal = BigDecimal.valueOf(ncv);
	 value = decimal.toString();
	}
	default:
		System.out.println("Invalid Sheet name");
	break;
}
return value;
}
	
public void textType(WebElement element,String value) {
	element.sendKeys(value);
}

public void btnClick(WebElement element) {
	element.click();
}

public void writeDataToExcel(int rowNum, int cellNum, String value) throws IOException {
	File writefile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\order1.xlsx");
	Workbook workbook = new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("orderid");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue(value);
	FileOutputStream out = new FileOutputStream(writefile);
	workbook.write(out);
}


}
	
