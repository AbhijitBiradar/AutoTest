package com.autotest.steps;

import java.io.IOException;

import org.testng.Assert;

import com.autotest.annotations.LazyAutowired;
import com.autotest.pages.ForgotYourPasswordPage;
import com.autotest.utils.ScreenshotUtil;

import io.cucumber.java.en.Then;

public class ForgotYourPasswordPageTest {

	@LazyAutowired
	private ForgotYourPasswordPage forgotYourPasswordPage;
	
	@LazyAutowired
	private ScreenshotUtil screenshotUtil;
	

	@Then("I should navigate Forgot Your Password page")
	public void i_should_navigate_Forgot_Your_Password_page() throws Exception {
		screenshotUtil.takeScreenshot();
		Assert.assertTrue(forgotYourPasswordPage.isAt());
	}
	
	@Then("Orange HRM Username field label should display")
	public void orange_HRM_Username_field_label_should_display() throws Throwable {
		screenshotUtil.takeScreenshot();
		Assert.assertTrue(forgotYourPasswordPage.IsOrangeHRMUsernameLabelDisplayed());
	}

	@Then("Orange HRM Username textbox should display")
	public void orange_HRM_Username_textbox_should_display() throws Throwable{
		screenshotUtil.takeScreenshot();
		Assert.assertTrue(forgotYourPasswordPage.IsOrangeHRMUsernameTextBoxDisplayed());
	}

	@Then("Reset Password button should display")
	public void reset_Password_button_should_display() throws Throwable{
		screenshotUtil.takeScreenshot();
		Assert.assertTrue(forgotYourPasswordPage.IsResetPasswordButtonDisplayed());
	}

	@Then("Canel button should display")
	public void canel_button_should_display() throws Throwable{
		screenshotUtil.takeScreenshot();
		Assert.assertTrue(forgotYourPasswordPage.IsCanelButtonDisplayed());
	}
}
