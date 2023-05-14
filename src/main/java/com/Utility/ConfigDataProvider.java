package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_Framework\\Config\\config.Properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getBaseUrl() {
		
		return pro.getProperty("BaseUrl");
	}
	
	public String getBaseUrl_QA2() {
		return pro.getProperty("BaseUrl_QA2");
	}
	

}
