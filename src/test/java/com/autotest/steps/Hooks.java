package com.autotest.steps;

import org.openqa.selenium.WebDriver;

import com.autotest.annotations.LazyAutowired;
import com.autotest.config.AutomationProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@LazyAutowired
	private WebDriver driver;

	@LazyAutowired
	private AutomationProperties properties;
	
	@Before
	public void openBrowser() {		 
		driver.manage().window().maximize();
		driver.get(properties.getAppURL());		
	}

	@After
	public void closeBrowser() {		
		driver.quit();		
	}
}
