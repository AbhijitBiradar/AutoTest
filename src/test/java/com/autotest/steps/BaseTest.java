package com.autotest.steps;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.autotest.SpringContextConfiguration;

@SpringBootTest(classes = {SpringContextConfiguration.class})
public class BaseTest  extends AbstractTestNGSpringContextTests{	
	
}
