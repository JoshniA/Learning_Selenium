package com.Amazokort.registertest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Amazokart.generic.common.BaseClass;
import com.Amazokart.generic.pagerepository.RegisterPage;
import com.aventstack.extentreports.Status;

public class RegisterTest extends BaseClass
{
	@Test()
	public void registerValidData()
	{
		
		String name=excelobj.readdata("Sheet1",1,1);
		String email=excelobj.readdata("Sheet1",1,2);
		String password=excelobj.readdata("Sheet1",1,3);
		String mobno=excelobj.readdata("Sheet1",1,4);
		String feedback=excelobj.readdata("Sheet1",1,6);
		test.log(Status.INFO, "Data taken from excel file sucess");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//provide implicitly wait
				webdriverobj.waitUntilElementFound();
				
				String exptitle="LearningSelenium";
				
				String acttitle=webdriverobj.driver.getTitle();
				System.out.println(acttitle);
				
				// Step 1: Verify Register page using Assert
				Assert.assertEquals(exptitle, acttitle,"verified Register Page");
				test.log(Status.PASS,"Step:1-VERIFIES-TITLE,REGISTER PAGE IS DISPLAYED");
				
				//Create an object for Register Page
				RegisterPage regpage=new RegisterPage(webdriverobj.driver);
				
				boolean elementExpCondition=true;
				boolean elementActualCondition=regpage.getNameTextField().isDisplayed();
				
				//Step 2: Verify the element
				Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
				test.log(Status.PASS,"Step:2-Verify -NameTextField,It is Displayed");
				 	
				//Step 3: Perform Actions --clear
				regpage.getNameTextField().clear();
				test.log(Status.PASS,"Step:3-NameTextField Cleared Sucess");
				
				//Step 4: Perform Actions --Enter Name
				regpage.getNameTextField().sendKeys(name);;
				test.log(Status.PASS,"Step:4-Enter UserName in NameTextField Sucess");

				
				//Step 5: Perform Actions --Enter Email
			   regpage.getEmailTextField().sendKeys(email);
				test.log(Status.PASS,"Step:5-Enter emailTextField Sucess");

						
				
				//Step 6: Perform Actions --Enter Password
				regpage.getPwdTextField().sendKeys(password);
				test.log(Status.PASS,"Step:6-enter PasswordTextField Sucess");

				
				//Step 7: Perform Actions --Enter Mobile number
				regpage.getMobTextField().sendKeys(mobno);
				test.log(Status.PASS,"Step:7-Enter MobileTextField  Sucess");

				
				//Step 8: Perform Actions --Enter Feedback
				regpage.getFeedbackTextfield().sendKeys(feedback);
				test.log(Status.PASS,"Step:8-Enter FeedbackTextField Sucess");
				test.log(Status.INFO,"Register Valid data sucess");

			}
	
	@Test
	public void validateRegisterButtoncolour()
	{
		 webdriverobj.waitUntilElementFound();
			
			String exptitle="LearningSelenium";
			
			String acttitle=webdriverobj.driver.getTitle();
			System.out.println(acttitle);
			
			// Step 1: Verify Register page using Assert
			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
			
			//Create an object for Register Page
			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
			
			//Step 2: Verify the element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
		    
			String color=regpage.getRegisterButton().getCssValue("color");
			
			System.out.println("color of webelement is "+color);
			Reporter.log("RegisterButtoncolour",true);
		
	}
	@Test
	public void validateRegisterButtonsize()
	{
		webdriverobj.waitUntilElementFound();
		
		String exptitle="LearningSelenium";
		
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
		
		//Create an object for Register Page
		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
		
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
		
		//Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
	    
        org.openqa.selenium.Dimension size=regpage.getRegisterButton().getSize();
		
		int width=size.getWidth();
		
		int height=size.getHeight();
		
		
		System.out.println("Width :"+width);
		

		System.out.println("Height  :"+height);
		Reporter.log("RegisterButtonsize",true);

	
	}
	
	@Test
	public void validateRegisterButtonposition()
	{
		 webdriverobj.waitUntilElementFound();
			
			String exptitle="LearningSelenium";
			
			String acttitle=webdriverobj.driver.getTitle();
			System.out.println(acttitle);
			
			// Step 1: Verify Register page using Assert
			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
			
			//Create an object for Register Page
			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
			
			//Step 2: Verify the element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
	        org.openqa.selenium.Point location=regpage.getRegisterButton().getLocation();
			
			int x=location.getX();
			
			int y=location.getY();
			
			
			System.out.println("x axis :"+x);
			
			System.out.println("y axis  :"+y);
			Reporter.log("RegisterButtonposition",true);
		
	}



	}
		
	

