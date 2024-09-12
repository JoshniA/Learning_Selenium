package com.Amazokart.generic.common;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends ObjectUtility 
{
	public WebDriver driver;
	public static WebDriver driver_static;
	
	
	@DataProvider(name="register")
	
	public Object[][] registerdata()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="Joshni";
		data[0][1]="Joshni@gmail.com";
		data[0][2]="Testing";
		
		data[1][0]="Reshma";
		data[1][1]="rrshma@gmail.com";
		data[1][2]="Developer";
		
		data[2][0]="Priyanka";
		data[2][1]="priyapolusani@gmail.com";
		data[2][2]="Devops";
		
		return data;
	}
    @BeforeSuite
	public void getSuiteConnections() 
   {
		Reporter.log("get SuiteConnections done Successful", true);
	}

	
	@BeforeTest
	public void precondition()
	{
		//create object for all library
		
		objectCreation();
		
		//configure the SparkReportInformation
		spark.config().setDocumentTitle("Regression Testing for RegisterPage");
		spark.config().setReportName("Regression Suite");
		spark.config().setTheme(Theme.DARK);
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		//Configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Joshni");
		report.setSystemInfo("OperatingSystem:","WINDOWS11");
		report.setSystemInfo("Browser:","chrome");
		report.setSystemInfo("BrowserVersion:","128.0.6613.121");
		
		Reporter.log("Pre Condition Successful", true);
	}

	
	


	@Parameters("browser")
	@BeforeClass
	public void browserSetUp(String browsername) 
	{
		//create the TestREport
				test=report.createTest("RegisterValidData");
		
		//Step 1:Launch the browser
		webdriverobj.launchBrowser(browsername);
		
		//Step 2: Maximize the browser
		webdriverobj.maximizeBrowser();
		
		
		// Fetch url data property file
		String url1 = propertyobj.readdata("url");
    
	// Step3: Navigate to the application using URL
	  
		    webdriverobj.navigateToApp(url1);
		    
			Reporter.log("BrowserSetup "+browsername+"successful", true);
		}

	@BeforeMethod
		public void Login() {
			Reporter.log("Login Successful", true);

		}

		@AfterMethod
		public void Logout() {
			Reporter.log("Logout Successful", true);
		}
		@AfterClass
		public void closebrowser() {
			// Close the Browser
			//driver.close();
			webdriverobj.closeWindow();
			Reporter.log("CloseBrowser Successful", true);
		}

		
		@AfterTest
		public void postcondition() {
			//Flush the Report Information
			report.flush();
			Reporter.log("Postcondition done Successful", true);
		}
		
		@AfterSuite
		public void terminateSuiteConnections() {
			Reporter.log("terminate SuiteConnections done Successful",true);
		}}
		


	
   


