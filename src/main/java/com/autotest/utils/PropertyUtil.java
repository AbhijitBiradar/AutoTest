package com.autotest.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PropertyUtil {
	private Properties properties;
	private Map<Object, Object> map;	

	public void loadPropertyFile(String propertyFilePath) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public String getPropertyValue(String propertyName) {		

		String propertyValue = properties.getProperty(propertyName);
		if (propertyValue != null) {

			return propertyValue;
		} else {

			throw new RuntimeException(
					"Property not specified in the specified properties file for the key" + propertyName);
		}
	}

	public Map<Object, Object> getAllPropertyValue() {
		Enumeration keys = properties.propertyNames();

		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			map.put(key, properties.getProperty(key));
		}

		return map;
	}
}
