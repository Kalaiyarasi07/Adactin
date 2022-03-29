package org.junit;

import java.io.IOException;
import java.util.Date;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Junit extends BaseClass {
	
	@Rule
	public TestName test = new TestName();
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("http://adactinhotelapp.com/");
	}
	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void ts01() {
		driver.findElement(By.id("username")).sendKeys("Kalai1996cse");
		driver.findElement(By.id("password")).sendKeys("Mar@2022");
		driver.findElement(By.id("login")).click();

	}
	@Test
	public void ts02() {
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		s.selectByValue("Melbourne");
		WebElement hotel = driver.findElement(By.id("hotels"));
        Select s1= new Select(hotel);
        s1.selectByVisibleText("Hotel Sunshine");
        WebElement room = driver.findElement(By.id("room_type"));
        Select s2 = new Select(room);
        s2.selectByVisibleText("Deluxe");
        WebElement noroom = driver.findElement(By.id("room_nos"));
        Select s3 = new Select(noroom);
        s3.selectByValue("3");
        driver.findElement(By.id("datepick_in")).sendKeys("19/03/2022");
        driver.findElement(By.id("datepick_out")).sendKeys("20/03/2022");
        WebElement adult = driver.findElement(By.id("adult_room"));
        Select s4 = new Select(adult);
        s4.selectByVisibleText("2 - Two");
        WebElement child = driver.findElement(By.id("child_room"));
        Select s5 = new Select(child);
        s5.selectByVisibleText("1 - One");
        driver.findElement(By.id("Submit")).click();
}
	@Test
	public void ts03() {
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
	}
	@Test
	public void ts04() {
        driver.findElement(By.name("first_name")).sendKeys("Kalaiyarasi");
        driver.findElement(By.name("last_name")).sendKeys("Rajakumar");
        driver.findElement(By.id("address")).sendKeys("525 Pillayar kovil Street, pathirakottai");
	driver.findElement(By.id("cc_num")).sendKeys("9876478077547890");
	WebElement credit = driver.findElement(By.id("cc_type"));
	Select s6 = new Select(credit);
	s6.selectByVisibleText("VISA");
	WebElement month = driver.findElement(By.id("cc_exp_month"));
	Select s7 = new Select(month);
	s7.selectByVisibleText("March");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select s8 = new Select(year);
	s8.selectByVisibleText("2014");
	driver.findElement(By.id("cc_cvv")).sendKeys("876");
	driver.findElement(By.id("book_now")).click();

	}
	@After
	public void after() throws IOException {
		Date date = new Date();
		System.out.println(date);
		String methodName = test.getMethodName();
		takeScreenShot(methodName);
	}
@AfterClass
public static void afterClass() {
	driver.close();
}

}
