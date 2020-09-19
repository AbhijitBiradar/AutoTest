package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class LogConfig {	
	@Value("${log.logFilePath}")
	private String logFilePath;
	
	@Value("${log.generateLog}")
	private String generateLog;
	
	@Value("${log.appendLog}")
	private String appendLog;
	
	@Value("${log.createNewLogFile}")
	private String createNewLogFile;	
}
