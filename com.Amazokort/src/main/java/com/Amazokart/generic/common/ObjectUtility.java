package com.Amazokart.generic.common;

import com.Amazokort.generic.excelutility.ReadExcelFile;
import com.Amazokort.generic.javautility.JavaUtility;
import com.Amazokort.generic.propertyfileutility.ReadPropertyFile;
import com.Amazokort.generic.webdriverutility.WebdriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ObjectUtility implements FrameworkConstant
{
	
		public ReadExcelFile excelobj;
		public JavaUtility javaojb;
		public ReadPropertyFile propertyobj;
		public WebdriverUtility webdriverobj;
		public ExtentSparkReporter spark;
		public ExtentReports report;
		public ExtentTest test;
		
		
	public void objectCreation()
	{
		 excelobj=new ReadExcelFile();
		 javaojb=new JavaUtility();
		 propertyobj=new ReadPropertyFile();
		 webdriverobj=new WebdriverUtility();
		 
		 //create the sparkReport
		 spark=new ExtentSparkReporter(reportpath);
		 
		 //create the extent Report
		 report=new ExtentReports();
		 
	}

}
