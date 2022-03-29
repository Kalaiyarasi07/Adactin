package org.junit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static WebDriver driver; 
public static void browserLaunch(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
public static void takeScreenShot(String pathName) throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File(pathName+ ".png"));
}
}
