package com.autotest.utils;

public class AssertUtil {	
	public boolean assertEqual(String expected, String actual) {
		if(expected.contentEquals(actual)) {			
			return true;
		}		
		return false;
	}
	
	public boolean assertEqual(String expected, String actual, String message) {
		if(expected.contentEquals(actual)) {			
			return true;
		}		
		return false;
	}
	
	public boolean assertNotEqual(String expected, String actual) {
		if(!expected.contentEquals(actual)) {			
			return true;
		}		
		return false;
	}
	
	public boolean assertNotEqual(String expected, String actual, String message) {
		if(!expected.contentEquals(actual)) {			
			return true;
		}		
		return false;
	}
	
	public boolean assertTrue(boolean condition, String message) {
		if(condition) {			
			return true;
		}		
		return false;		
	}	
	
	public boolean assertTrue(boolean condition) {
		if(condition) {			
			return true;
		}		
		return false;		
	}	
	
	public boolean assertFalse(boolean condition) {
		if(!condition) {			
			return true;
		}		
		return false;		
	}	
	
	public boolean assertFalse(boolean condition, String message) {
		if(!condition) {			
			return true;
		}		
		return false;		
	}
}
