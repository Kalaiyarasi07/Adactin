package org.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass11 {
	static WebDriver driver;

	
public static void browserLaunch(String url) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.get(url);
}
	

}
