package com.autotest.config;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class AutomationProperties {
	@Value("${application.url}")
	private String appURL;
	
	@Value("${screenshot.path}")
	private Path filePath;
	
}
