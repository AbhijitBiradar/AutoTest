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
	
	@Autowired
	private FileUtil fileUtil;
	
	@Value("${screenshot.path}")
	private Path filePath;
	
	private String fileName;
	
	public void takeScreenshot() throws IOException {
		fileName=fileUtil.getRandomFileName() + "_img.png";
		File soureFile=driver.getScreenshotAs(OutputType.FILE);
		FileCopyUtils.copy(soureFile, filePath.resolve(fileName).toFile());
	}	
}
