package com.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	private WebElement txt_UserName;

	@FindBy(id = "txtPassword")
	private WebElement txt_Password;

	@FindBy(id = "btnLogin")
	private WebElement btn_Login;

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	private WebElement lnk_Welcome;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement lnk_LogOut;

	@Override
	public boolean isAt() {
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By) txt_UserName));
		if (txt_UserName.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void Launch() {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");		
	}

	public void login(String userName, String password) {
		txt_UserName.sendKeys(userName);
		txt_Password.sendKeys(password);
		btn_Login.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(10000);

		lnk_Welcome.click();

		Thread.sleep(10000);

		lnk_LogOut.click();
	}
	
	public void close() {
		driver.quit();
	}
}
