package com.Amazokort.registertest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;
import com.Amazokart.generic.pagerepository.RegisterPage;
import com.Amazokort.generic.excelutility.ReadExcelFile;


//@Listeners(com.Amazokart.generic.listenerutility.Listeners.class)
public class RegisterTest extends BaseClass
{
	
	@Test(enabled=false)
	public void createuser_validData() throws Throwable, Throwable
	{
		//verify page Using Assert
	    String exp_title="LEarning WEB TECHNOLOGY FORMS";
	    String act_title=driver.getTitle();
	    System.out.println(act_title);
	    Assert.assertEquals(act_title,exp_title );
	    
	    //Create Object for RegisterPage
	     RegisterPage regpage=new RegisterPage();
	    //Step1:Clear the Name in the Name Textfield
	    driver.findElement(By.id("name")).clear();
		Reporter.log("createuser_validData for Register Test",true);
		
		//Create an Object for ExcelUtilityFile class
	   // ReadExcelFile excel_f=new ReadExcelFile();
	    
		//step2:write the name in the name Text Field
	    regpage.getname().sendKeys(excelobj.readdata("student", 1, 1));
	   
	    
	    //step 3:Display the mail
	    System.out.println(excelobj.readdata("Sheet1", 2,2));
	    
	    //step 4:Write the data
	    excelobj.writedata("Sheet1", 2, 2, "joshni");
		Reporter.log("createuser_validData for Register Test",true);

	}
	
	
	@Test(dataProvider = "register")
	public void createuser_invalidData(String name,String email, String password)
	{
		//Step1:isentify name Testfield
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		//Step1:isentify name Testfield
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		//Step1:isentify name Testfield
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
				
		
		System.out.println("Name"+name);
		System.out.println("Id"+email);
		System.out.println("Dept"+password);

		Reporter.log("createuser_InvalidData for Register Test",true);
	}

}
