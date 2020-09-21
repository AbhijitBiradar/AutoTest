package com.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.autotest.annotations.Page;

@Page
public class ForgotYourPasswordPage extends BasePage{
	
	@FindBy(xpath = "//label[contains(text(),'OrangeHRM Username')]")
	private WebElement lbl_OrangeHRMUsername;

	@FindBy(xpath ="//input[@id='securityAuthentication_userName']")
	private WebElement txt_UserName;
	
	@FindBy(xpath = "//input[@id='btnSearchValues']")
	private WebElement btn_ResetPassword;
	
	@FindBy(xpath = "//*[@id=\"btnCancel\"]")
	private WebElement btn_Canel;
	
	@FindBy(xpath = "//h1[text()='Forgot Your Password?']")
	private WebElement lbl_ForgotYourPassword;	
	
	
	
	@Override
	public boolean isAt() {
		webDriverWait.until(ExpectedConditions.visibilityOf(lbl_ForgotYourPassword));
		if (lbl_ForgotYourPassword.isDisplayed()) {			
			return true;
		} else {			
			return false;
		}
	}	
	
	public boolean IsOrangeHRMUsernameLabelDisplayed() {
		return lbl_OrangeHRMUsername.isDisplayed();
	}
	
	public boolean IsOrangeHRMUsernameTextBoxDisplayed() {
		return txt_UserName.isDisplayed();
	}
	
	public boolean IsResetPasswordButtonDisplayed() {
		return btn_ResetPassword.isDisplayed();
	}
	
	public boolean IsForgotYourPasswordLabelDisplayed() {
		return lbl_ForgotYourPassword.isDisplayed();
	}
	
	public boolean IsCanelButtonDisplayed() {
		return btn_Canel.isDisplayed();
	} 

}
