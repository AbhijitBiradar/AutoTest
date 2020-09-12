package com.autotest.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {

	@Bean
	@ConditionalOnProperty(name="browser", havingValue="chrome")
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("85.0.4183.83").setup();
		return new ChromeDriver();
	}
	
	@Bean
	@ConditionalOnProperty(name="browser", havingValue="firefox")	
	public WebDriver firefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}	
}
