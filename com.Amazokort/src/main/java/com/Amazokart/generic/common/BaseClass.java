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

public class BaseClass extends ObjectUtility
{
	public  WebDriver driver=null;
	public static WebDriver driver_static=null;
	//login--logout
	
	@DataProvider(name="register")
	public Object[][] registerdata()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="Josh";
		data[0][1]="101";
		data[0][2]="Testing";
		
		data[1][0]="Joshni";
		data[1][1]="102";
		data[1][2]="Developer";
		
		data[2][0]="Joshii";
		data[2][1]="103";
		data[2][2]="Devops";
		
		return data;
	}
	
	@BeforeMethod
	public void login()
	{
		   Reporter.log("Login sucessfully",true);
	}
   @AfterMethod
   public void logout()
   {
	   Reporter.log("Logout sucessfully",true);

   }
   @Parameters("browser")
   
   //To open Browser
   @BeforeClass
   public void browserSetup(String bname) 
   {            
	  
	   //if user browsername="chrome"
	   if(bname.equalsIgnoreCase("chrome"))
	   {
		   //Launch the Browser-Chrome
		   driver=new ChromeDriver();
	   }
	 //if user browsername="firefox"
	   else if(bname.equalsIgnoreCase("firefox"))
	   {
		   //Launch the Browser-firefox
		   driver=new FirefoxDriver();
	   }
	 //if user browsername="edge"
	   else if(bname.equalsIgnoreCase("edge"))
	   {
		   //Launch the Browser-edge
		   driver=new EdgeDriver();
	   }
	   else {
		   System.out.println("u have enter the invalid BrowserName");
		   driver=new ChromeDriver();
	   }
	   
	   //create obj for property file
	   objectCreation();
	   
	   //ftetch the data
	    String url1 = propertyobj.readdata("url");
	    System.out.println(url1);
		
	   //Navigate to the Application via URL
	   driver.get(url1);
	   Reporter.log("BrowserSetup sucessfully",true);
	   
   }
   @AfterClass
   public void closebrowser()
   {
	   //close the browser
	  
	   Reporter.log("Closebrowser sucessfully",true);
   }
   
   //JDBC connections
   @BeforeTest
   public void precondition()
   {
	   Reporter.log("Precondition Done sucessfully",true);
   }
   @AfterTest
   public void postcondition()
   {
	   Reporter.log("Postcondition Done sucessfully",true);

   }
   
   //server connection
   @BeforeSuite
   public void getsuiteconnection()
   {
	   Reporter.log("Getsuiteconnection Done sucessfully",true);
   }
   @AfterSuite
   public void terminatesuiteconnection()
   {
	   Reporter.log("Terminatesuiteconnection Done sucessfully",true);
   }
   
}

