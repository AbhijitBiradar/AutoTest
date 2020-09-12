package com.autotest.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

@Component
public class ScreenshotUtil {
	@Autowired 
	TakesScreenshot driver;
	
	@Value("${screenshot.path}")
	private Path filePath;
	
	private String fileName;
	
	public void takeScreenshot() throws IOException {
		fileName=getDateTime() + "_img.png";
		File soureFile=driver.getScreenshotAs(OutputType.FILE);
		FileCopyUtils.copy(soureFile, filePath.resolve(fileName).toFile());
	}
	
	public String getDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");  
	    Date date = new Date();  
	    return formatter.format(date).toString();  
	}
	
	
}
