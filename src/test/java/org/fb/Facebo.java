package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Kalai");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		
	}

}
