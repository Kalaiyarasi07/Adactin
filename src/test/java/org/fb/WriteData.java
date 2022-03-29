package org.fb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteData {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
WebElement skill = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
Select select = new Select(skill);
List<WebElement> options = select.getOptions();

File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FaceBook\\Datas\\Write.xlsx");
Workbook workbook = new XSSFWorkbook();
Sheet sheet = workbook.createSheet("Skill");
for (int i = 0; i < options.size(); i++) {
	String value = options.get(i).getText();
	Row row = sheet.createRow(i);
	Cell cell = row.createCell(0);
	cell.setCellValue(value);
}
FileOutputStream out = new FileOutputStream(file);
workbook.write(out);


	}

}
