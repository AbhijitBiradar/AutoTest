package com.autotest.tests;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.autotest.annotations.LazyAutowired;
import com.autotest.pages.HomePage;
import com.autotest.pages.LoginPage;
import com.autotest.utils.ScreenshotUtil;

public class LoginTest extends BaseTest{
	
	@LazyAutowired
	private LoginPage loginPage;
	
	@LazyAutowired
	private HomePage homePage;
	
	@LazyAutowired
	private ScreenshotUtil screenshotUtil;
	
	@Test
	public void loginTestValidUser() throws InterruptedException, IOException {
		loginPage.Launch();
		
		Assert.assertTrue(loginPage.isAt());
		screenshotUtil.takeScreenshot();
		
		loginPage.login("Admin","admin123");
		screenshotUtil.takeScreenshot();
		
		Assert.assertTrue(homePage.isAt());
		homePage.logout();
		screenshotUtil.takeScreenshot();
		
		loginPage.close();		
	}
}
