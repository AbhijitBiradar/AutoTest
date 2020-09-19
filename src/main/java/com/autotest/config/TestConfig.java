package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class TestConfig {
	@Value("${test.dryRun}")
	private String dryRun;

	@Value("${test.testScreenShot}")
	private String testScreenShot;

	@Value("${test.executeParallel}")
	private String executeParallel;

	@Value("${test.testEnvironment}")
	private String testEnvironment;
}
