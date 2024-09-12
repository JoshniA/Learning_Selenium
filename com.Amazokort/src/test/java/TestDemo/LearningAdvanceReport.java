
package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport 
{
	public static void main(String[] args) {
		//create object for SparkReport
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the SparkReport information
		spark.config().setDocumentTitle("Regression Testing for the RegisterPage");
		
		spark.config().setReportName("RegressionSuite");
		
		spark.config().setTheme(Theme.DARK);
		
		//Create the extent Report
		ExtentReports report=new ExtentReports();
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		//Configure the System Information in Extent Report by attaching
		
		report.setSystemInfo("DeviceName:","Joshni");
		report.setSystemInfo("OperatingSystem:","WINDOWS11");
		report.setSystemInfo("Browser:","chrome");
		report.setSystemInfo("BrowserVersion:","128.0.6613.121");
		
		//Create the Test Information
		 ExtentTest test=report.createTest("Regressiontest");
		 
		 //Steps Information
		 test.log(Status.INFO,"Step1: Launching the browser Sucessfull");
		 
		 test.log(Status.INFO, "Step2: Navigating To Application Via URL Sucessfull");
		 
		 test.log(Status.PASS, "Step3: Verified the Webpage Sucessfull");
		 
		 
		 if(true==true)
		 {
			 test.log(Status.PASS, "Step4: Verified The WebElement Sucessfull");
			 
		 }
		 else
		 {
			 test.log(Status.FAIL, "Step4: Verified The WebElement Not Displayed");
			
			  
		 }
		
		 test.log(Status.SKIP, "Step5: Element is Hidden");
		 
		 
		 
		 //Flush the Report Information
		 report.flush();
		 
		 System.out.println("Execution done");
		
		
		

	}

}
