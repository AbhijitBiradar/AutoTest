package com.autotest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.autotest.annotations.LazyConfiguration;

@LazyConfiguration
public class WaitUtil {
	@Value("${default.timeout}")
	private int timeout;
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public WebDriverWait webDriverWait(WebDriver driver) {		
		return new WebDriverWait(driver, timeout);
	}
}
