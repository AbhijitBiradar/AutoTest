package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("classpath:configs/application.properties")
public class DBConfig {
	
	@Value("${db.driver}")
	private String dbDriver;
	
	@Value("${db.url}")
	private String dbURL;
	
	@Value("${db.userName}")
	private String dbUserName;
	
	@Value("${db.password}")
	private String dbPassword;	
}
