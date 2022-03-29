package org.adact;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	BaseClass b = new BaseClass();
	
//	b.getDriver("edge");
//	b.getUrl("http://adactinhotelapp.com/");
    b.getDriver("chrome");
	b.getUrl("http://adactinhotelapp.com/");
//    b.getDriver("firefox");
//   b.getUrl("https://www.google.co.in/");
//	b.getUrl("http://adactinhotelapp.com/");
	WebElement locator = b.locator("id", "username");
	String dataFromExcel = b.getDataFromExcel(1, 0);
	b.textType(locator, dataFromExcel);
	WebElement locator2 = b.locator("id", "password");
	String dataFromExcel1 = b.getDataFromExcel(1, 1);
	b.textType(locator2, dataFromExcel1);
	WebElement locator3 = b.locator("id", "login");
	b.btnClick(locator3);
	WebElement locator4 = b.locator("xpath","//select[@id='location']" );
	String dataFromExcel2 = b.getDataFromExcel(1, 2);
	b.textType(locator4, dataFromExcel2);
	WebElement locator5 = b.locator("id", "hotels");
	String dataFromExcel3 = b.getDataFromExcel(1, 3);
	b.textType(locator5, dataFromExcel3);
	WebElement locator6 = b.locator("id", "room_type");
	String dataFromExcel4 = b.getDataFromExcel(1, 4);
	b.textType(locator6, dataFromExcel4);
	WebElement locator7 = b.locator("id", "room_nos");
	String dataFromExcel5 = b.getDataFromExcel(1, 5);
	b.textType(locator7, dataFromExcel5);
	WebElement locator8 = b.locator("id", "datepick_in");
	String dataFromExcel6 = b.getDataFromExcel(1, 6);
	b.textType(locator8, dataFromExcel6);
	WebElement locator9 = b.locator("id", "datepick_out");
	String dataFromExcel7 = b.getDataFromExcel(1, 7);
	b.textType(locator9, dataFromExcel7);
	WebElement locator10 = b.locator("id", "adult_room");
	String dataFromExcel8 = b.getDataFromExcel(1, 8);
	b.textType(locator10, dataFromExcel8);
	WebElement locator11 = b.locator("id", "child_room");
	String dataFromExcel9 = b.getDataFromExcel(1, 9);
	b.textType(locator11, dataFromExcel9);
	WebElement locator12 = b.locator("id", "Submit");
	b.btnClick(locator12);
	WebElement locator13 = b.locator("id", "radiobutton_0");
	b.btnClick(locator13);
	WebElement locator14 = b.locator("id", "continue");
	b.btnClick(locator14);
	WebElement locator15 = b.locator("name", "first_name");
	String dataFromExcel10 = b.getDataFromExcel(1, 10);
	b.textType(locator15, dataFromExcel10);
	WebElement locator16 = b.locator("name", "last_name");
	String dataFromExcel11 = b.getDataFromExcel(1, 11);
	b.textType(locator16, dataFromExcel11);
	WebElement locator17 = b.locator("id", "address");
	String dataFromExcel12 = b.getDataFromExcel(1, 12);
	b.textType(locator17, dataFromExcel12);
	WebElement locator18 = b.locator("id", "cc_num");
	String dataFromExcel13 = b.getDataFromExcel(1, 13);
	b.textType(locator18, dataFromExcel13);
	WebElement locator19 = b.locator("id", "cc_type");
	String dataFromExcel14 = b.getDataFromExcel(1, 14);
	b.textType(locator19, dataFromExcel14);
	WebElement locator20 = b.locator("id", "cc_exp_month");
	String dataFromExcel15 = b.getDataFromExcel(1, 15);
	b.textType(locator20, dataFromExcel15);
	WebElement locator21 = b.locator("id", "cc_exp_year");
	String dataFromExcel16 = b.getDataFromExcel(1, 16);
	b.textType(locator21, dataFromExcel16);
	WebElement locator22 = b.locator("id", "cc_cvv");
	String dataFromExcel17 = b.getDataFromExcel(1, 17);
	b.textType(locator22, dataFromExcel17);
	WebElement locator23 = b.locator("id", "book_now");
	b.btnClick(locator23);
	Thread.sleep(5000);
	
//	WebElement locator24 = b.locator("id", "//input[@type='button']");
//	b.btnClick(locator24);
	
	WebElement locator25 = b.locator("id", "order_no");
	
	String attribute = locator25.getAttribute("value");
	System.out.println(attribute);
	b.writeDataToExcel(3,1,attribute);
	
	
	
	
	
	
	
	
	
	
	
	

}
}
