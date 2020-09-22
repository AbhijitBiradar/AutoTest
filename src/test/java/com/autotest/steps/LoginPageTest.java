package com.autotest.steps;

import java.io.IOException;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import com.autotest.annotations.LazyAutowired;
import com.autotest.pages.HomePage;
import com.autotest.pages.LoginPage;
import com.autotest.utils.ScreenshotUtil;

import ccom.autotest.objects.Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest(classes={com.autotest.SpringContextConfiguration.class})
public class LoginPageTest extends Objects{
	
	@Given("I am on HRM Login page")
	public void i_am_on_HRM_Login_page() throws IOException {		
		loginPage.Launch();

		Assert.assertTrue(loginPage.isAt());
		screenshotUtil.takeScreenshot();
	}

	@When("I enter valid user name as {string}")
	public void i_enter_valid_user_name_as(String userName) throws IOException {
		loginPage.enterUserName(userName);
		screenshotUtil.takeScreenshot();
	}

	@When("I enter valid password as {string}")
	public void i_enter_valid_password_as(String password) throws IOException {
		loginPage.enterPassword(password);
		screenshotUtil.takeScreenshot();
	}

	@When("click on login button")
	public void click_on_login_button() throws IOException {
		screenshotUtil.takeScreenshot();
		loginPage.clickOnLogin();
	}

	@Then("user should login to app and display Home page")
	public void user_should_login_to_app_and_display_Home_page() throws IOException {
		Assert.assertTrue(homePage.isAt());
		screenshotUtil.takeScreenshot();
		
		loginPage.close();
	}
	
	@Then("application should display error message as {string} on login page")
	public void application_should_display_error_message_as_on_login_page(String errorMessage) throws Exception {
	    Assert.assertEquals(loginPage.getInvalidUserErrorMessage(), errorMessage);
	    screenshotUtil.takeScreenshot();
	    
	    loginPage.close();
	}
	
	@When("I click on Forgot Your Password link")
	public void i_click_on_Forgot_Your_Password_link() throws Exception {
		screenshotUtil.takeScreenshot();
		loginPage.clickOnForgotYourPasswordLink();
	}

}
