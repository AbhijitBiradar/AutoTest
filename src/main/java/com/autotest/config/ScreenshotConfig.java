package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class ScreenshotConfig {
	@Value("${screenshot.captureScreenshot}")
	private String captureScreenshot;

	@Value("${screenshot.screenshotFileType}")
	private String screenshotFileType;

	@Value("${screenshot.screenshotType}")
	private String screenshotType;

	@Value("${screenshot.screenshotFilePath}")
	private String screenshotFilePath;
}
