package com.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;

import com.autotest.annotations.Page;
import com.autotest.config.AutomationProperties;

@Page
public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	private WebElement txt_UserName;

	@FindBy(id = "txtPassword")
	private WebElement txt_Password;

	@FindBy(id = "btnLogin")
	private WebElement btn_Login;	
	
	@FindBy(id = "spanMessage")
	private WebElement lbl_errorMessage;
	
	@FindBy(xpath ="//a[contains(text(),'Forgot your password?')]")
	private WebElement lnk_ForgotYourPassword;
		
	@Autowired
	private AutomationProperties properties;

	@Override
	public boolean isAt() {
		webDriverWait.until(ExpectedConditions.visibilityOf(txt_UserName));
		if (txt_UserName.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void Launch() {
		//driver.manage().window().maximize();
		//driver.get(properties.getAppURL());		
	}

	public void login(String userName, String password) {
		txt_UserName.sendKeys(userName);
		txt_Password.sendKeys(password);
		btn_Login.click();
	}
	
	public void enterUserName(String userName) {
		txt_UserName.sendKeys(userName);
	}	
	
	public void enterPassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_Login.click();
	}
	
	public String getInvalidUserErrorMessage() {
		return lbl_errorMessage.getText().toString();
	}
	
	public void close() {
		//driver.quit();
	}
	
	public void clickOnForgotYourPasswordLink() {
		lnk_ForgotYourPassword.click();
	}
}
