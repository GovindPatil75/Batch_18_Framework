package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	  public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String ReportPath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_Framework\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("AutomationTest Report");
		reporter.config().setReportName("Batch 18 Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project", "ABC ");
		extent.setSystemInfo("Selenium", "3.141.59");
		extent.setSystemInfo("O.S.", "Window 10");
		extent.setSystemInfo("Browser Name", "Chrome");
		return extent;
		
	}

}
