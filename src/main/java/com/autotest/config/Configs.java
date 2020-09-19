package com.autotest.config;

import java.nio.file.Path;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.autotest.annotations.LazyAutowired;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class Configs {
	@LazyAutowired	
	private DBConfig dbConfig;
	
	@LazyAutowired	
	private LogConfig logConfig;
	
	@LazyAutowired	
	private ReportConfig reportConfig;
	
	@LazyAutowired	
	private ScreenshotConfig screenshotConfig;
	
	@LazyAutowired	
	private TestConfig testConfig;	
}
