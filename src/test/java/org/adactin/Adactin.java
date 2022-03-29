package org.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin extends BaseClass {
public static void main(String[] args) throws IOException {
	BaseClass b = new BaseClass();
	b.getDriver("chrome");
	b.getUrl("http://adactinhotelapp.com/");
	String username = b.getDataFromExcel(1, 0);
	String password = b.getDataFromExcel(1, 1);
	String location = b.getDataFromExcel(1, 2);
	String hotel = b.getDataFromExcel(1, 3);
	String room = b.getDataFromExcel(1, 4);
	String no = b.getDataFromExcel(1, 6);
	String inDate = b.getDataFromExcel(1, 7);
	String outDate = b.getDataFromExcel(1, 8);
	String adult = b.getDataFromExcel(1, 9);
	String children = b.getDataFromExcel(1, 10);
	String firstname = b.getDataFromExcel(1, 11);
	String lastname = b.getDataFromExcel(1, 12);
	String address = b.getDataFromExcel(1, 13);
	String cardNo = b.getDataFromExcel(1, 14);
	String cardType = b.getDataFromExcel(1, 15);
	String cardMonth = b.getDataFromExcel(1, 16);
	String cardyear = b.getDataFromExcel(1, 17);
	String cvv = b.getDataFromExcel(1, 18);
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys(username);
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys(password);
	WebElement login = driver.findElement(By.id("login"));
	login.click();



 }
 }
