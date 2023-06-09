package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	
	public static void custom_SendKeys(WebElement element ,String value,String FieldName) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, FieldName+"==Value Succefully Send=="+value);
			
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	 }
	
	public static void custom_click(WebElement element,String FieldName) {
		
		try {
			element.click();
			test.log(Status.PASS, "Clicked Succefully =="+FieldName);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
	}
	
}
