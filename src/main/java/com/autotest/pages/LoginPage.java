package com.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.autotest.annotations.Page;

@Page
public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	private WebElement txt_UserName;

	@FindBy(id = "txtPassword")
	private WebElement txt_Password;

	@FindBy(id = "btnLogin")
	private WebElement btn_Login;	
	
	@Value("${application.url}")
	private String appURL;

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
		driver.manage().window().maximize();
		driver.get(appURL);		
	}

	public void login(String userName, String password) {
		txt_UserName.sendKeys(userName);
		txt_Password.sendKeys(password);
		btn_Login.click();
	}

	
	
	public void close() {
		driver.quit();
	}
}
