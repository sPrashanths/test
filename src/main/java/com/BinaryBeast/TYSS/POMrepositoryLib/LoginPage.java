package com.BinaryBeast.TYSS.POMrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	}

	public void Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UsernameField;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PasswordField;
	
	@FindBy(id="submitButton")
	private WebElement LoginBtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameField() {
		return UsernameField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public void LoginToApp(String username,String password) {
		UsernameField.sendKeys(username);
		PasswordField.sendKeys(password);
		LoginBtn.click();
	}
	
}
