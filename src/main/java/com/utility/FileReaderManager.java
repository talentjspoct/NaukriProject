package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	
	private static FileInputStream fileInputStream;
	private static Properties property;
	
	private static void setUpProperty()  {
		File file = new File("C:\\Users\\deepa\\Downloads\\eclipse-jee-2024-06-R-win32-x86_64\\eclipse\\eclipse-workspace\\JavaJ2EE\\NaukriProject\\src\\main\\resources\\TestData.Properties");
		try {
			
			fileInputStream = new FileInputStream(file);
			property = new Properties();
			property.load(fileInputStream);
			
		}catch(FileNotFoundException e) {
			Assert.fail("ERROR : OCCUR DURING FILE LOADING");
		}catch(Exception e) {
			Assert.fail("ERROR : OCCUR DURING FILE READING");
		}
	}
	
	public static String getDataProperty(String dataValue) {
		setUpProperty();
		String data = property.getProperty(dataValue);
		return data;
		
	}



}
