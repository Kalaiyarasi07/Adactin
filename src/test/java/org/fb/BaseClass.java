package org.fb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
public void getDriver() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
}
public void launchUrl(String url) {
	driver.get(url);
}
public void typeText(WebElement element, String data) {
	element.sendKeys("data");
System.out.println(data);
System.out.println(data);

}
public void getAttribute(WebElement element, String Attributevalue) {
	String attribute = element.getAttribute("Attributevalue");
	}
public void getText(WebElement element) {
	String text = element.getText();
}
public void locatorId(String AttributeName) {
	WebElement element = driver.findElement(By.id("AttributeName"));
}
public void name(String AttributeName) {
	WebElement element = driver.findElement(By.name("AttributeName"));
}
public void className(String className) {
	WebElement element = driver.findElement(By.className("className"));
}
public void click(WebElement element) {
	element.click();
}
public void getTitle() {
	driver.getTitle();
}
public void getCurrentUrl() {
	driver.getCurrentUrl();
}
public void close() {
	driver.close();
}
public void quit() {
	driver.quit();
	
}
public void select(WebElement element, String AttributeName) {
	Select s = new Select(element);
	s.selectByValue("AttributeName");
}
public void select1(WebElement element, String Text) {
	Select s1 = new Select(element);
	s1.selectByVisibleText("Text");
}
public void select2(WebElement element, int Index) {
	Select s2 = new Select(element);
	s2.selectByIndex(Index);
}
public void select4(WebElement element, String AttributeName) {
	Select s = new Select(element);
	s.deselectByValue("AttributeName");
}
public void select5(WebElement element, String Text) {
	Select s1 = new Select(element);
	s1.deselectByVisibleText("Text");
}
public void select6(WebElement element, int Index) {
	Select s2 = new Select(element);
	s2.deselectByIndex(Index);
}
public void multiple(WebElement element) {
	Select se = new Select(element);
	se.isMultiple();
}
public void deselectAll(WebElement element) {
	Select se = new Select(element);
	se.deselectAll();
}
public void js(WebElement element, String data) {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("arguments[0].setAttribute('value','data')",element);
}
public void js1(WebElement element) {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("arguments[0].setAttribute('style','Background:green')",element);	
}
public void scrollDown(WebElement element) {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("arguments[0].scrollIntoView(true)",element);
}
public void scrollUp(WebElement element) {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("arguments[0].scrollIntoView(false)",element);
}
public void scrollDownpixel() {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("window.scrollBy(0,5000)");
}
public void scrollUppixel() {
	JavascriptExecutor execute =(JavascriptExecutor)driver;
	execute.executeScript("window.scrollBy(0,-5000)");
}
public void mouseHoverAction(WebElement element) {
	Actions actions = new Actions(driver);
	actions.moveToElement(element).perform();
}
public void doubleClick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
}
public void contextClick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
}
public void dragAndDrop(WebElement src, WebElement dest) {
	Actions actions = new Actions(driver);
	actions.dragAndDrop(src, dest).perform();
}
public void navigate(String url) {
	driver.navigate().to(url);
}
public void back() {
	driver.navigate().back();
}
public void forward() {
	driver.navigate().forward();
}
public void refresh() {
	driver.navigate().refresh();
}
public void deleteAll() {
	driver.manage().deleteAllCookies();
}
public void alertAccept() {
	Alert a = driver.switchTo().alert();
	a.accept();
}
public void alertDismiss() {
	Alert a = driver.switchTo().alert();
	a.dismiss();
}
public void frameIndex(int index) {
	driver.switchTo().frame(index);
}
public void framename(String name) {
	driver.switchTo().frame(name);
	}
public void frame1(WebElement element) {
	driver.switchTo().frame(element);
}
public void parFrame() {
	driver.switchTo().parentFrame();
}
public void defaultContent() {
	driver.switchTo().defaultContent();
}
public void actions() {
	Actions a = new Actions(driver);
	a.sendKeys(Keys.PAGE_DOWN).perform();
}
public void actions1() {
	Actions a = new Actions(driver);
	a.sendKeys(Keys.PAGE_UP).perform();
}
public void enter(WebElement element) {
	element.sendKeys(Keys.ENTER);
}
public void sendkeys(String name) {
	Actions a = new Actions(driver);
	a.keyDown(Keys.SHIFT).sendKeys("name").keyUp(Keys.SHIFT).perform();
}

}
