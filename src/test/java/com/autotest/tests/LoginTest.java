package com.autotest.tests;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.autotest.pages.LoginPage;
import com.autotest.utils.ScreenshotUtil;

public class LoginTest extends BaseTest{
	
	@Autowired
	private LoginPage loginPage;
	
	@Autowired
	private ScreenshotUtil screenshotUtil;
	
	@Test
	public void loginTestValidUser() throws InterruptedException, IOException {
		loginPage.Launch();
		screenshotUtil.takeScreenshot();
		
		loginPage.login("Admin","admin123");
		screenshotUtil.takeScreenshot();
		
		loginPage.logout();
		screenshotUtil.takeScreenshot();
		
		loginPage.close();
	}

}
