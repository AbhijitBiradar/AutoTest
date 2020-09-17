package com.autotest.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import com.autotest.config.AutomationProperties;

@Lazy
@Component
public class ScreenshotUtil {
	@Autowired 
	private ApplicationContext context;
	
	@Autowired
	private FileUtil fileUtil;
	
	@Autowired
	private AutomationProperties properties;
	
	private String fileName;
	
	public void takeScreenshot() throws IOException {
		fileName=fileUtil.getRandomFileName() + "_img.png";
		File soureFile=context.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
		FileCopyUtils.copy(soureFile, properties.getFilePath().resolve(fileName).toFile());
		
	}	
}
