package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass11{
	public Locator() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUserName;
	@FindBy(id="pass")
	private WebElement txtPassName;
	@FindBy(name="login")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassName() {
		return txtPassName;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}