package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class ReportConfig {
	@Value("${report.generateReport}")
	private String generateReport;

	@Value("${report.reportFilePath}")
	private String reportFilePath;

	@Value("${report.reportType}")
	private String reportType;

	@Value("${report.deletePreviousReport}")
	private String deletePreviousReport;
}
