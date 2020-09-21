package com.autotest.steps;

import org.openqa.selenium.WebDriver;

import com.autotest.annotations.LazyAutowired;
import com.autotest.config.AutomationProperties;
import com.autotest.config.Configs;
import com.autotest.utils.PropertyUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@LazyAutowired
	private WebDriver driver;

	@LazyAutowired
	private AutomationProperties properties;
	
	@LazyAutowired
	private Configs config;
	
	@LazyAutowired
	PropertyUtil propertyUtil;
	
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
