package com.autotest.utils;

import java.io.FileNotFoundException;

public class ResourceUtil {
	public String getResourcePath(String resource) {
		String path = getBaseResourcePath() + resource;
		return path;
	}
	
	public String getBaseResourcePath() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		return path;
	}
	
	public void getResourcePathInputStream(String path) throws FileNotFoundException{
		//return new FileInputStream(ResourceHelper.getResourcePath(path));
		//return type InputStream
	}
}
