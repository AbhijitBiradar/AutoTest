package com.autotest.steps;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = "com.autotest.steps", 
		strict = true,
		tags = {"@ForgotYourPassword"},
		plugin = {"json:target/cucumber.json"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}