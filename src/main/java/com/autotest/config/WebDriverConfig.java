package com.autotest.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import com.autotest.annotations.LazyConfiguration;
import com.autotest.annotations.ThreadScopeBean;

import io.github.bonigarcia.wdm.WebDriverManager;

@LazyConfiguration
public class WebDriverConfig {

	@ThreadScopeBean
	@ConditionalOnProperty(name="browser", havingValue="chrome")
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("85.0.4183.83").setup();
		return new ChromeDriver();
	}	
}
