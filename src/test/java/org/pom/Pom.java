package org.pom;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Pom extends BaseClass11{

	public static void main(String[] args) {
    browserLaunch("https://www.facebook.com/");
    Locator loc = new Locator();
    WebElement txtUserName = loc.getTxtUserName();
    txtUserName.sendKeys("kalai");
    driver.navigate().refresh();
    txtUserName.sendKeys("kalai");
    loc.getTxtPassName().sendKeys("12345");
    driver.navigate().refresh();
    loc.getTxtPassName().sendKeys("12345");
    loc.getBtnLogin().click();
	}
	}



