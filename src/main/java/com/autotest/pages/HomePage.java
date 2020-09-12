package com.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

import com.autotest.annotations.Page;

@Page
public class HomePage extends BasePage{

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	private WebElement lnk_Welcome;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement lnk_LogOut;
	
	@Override
	public boolean isAt() {
		webDriverWait.until(ExpectedConditions.visibilityOf(lnk_Welcome));
		if (lnk_Welcome.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
		lnk_Welcome.click();
		Thread.sleep(3000);
		lnk_LogOut.click();
	}

}
