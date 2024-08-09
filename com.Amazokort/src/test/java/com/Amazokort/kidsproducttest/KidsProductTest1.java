package com.Amazokort.kidsproducttest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest1 
{
	@Test(priority=3,dependsOnMethods = "addproduct",enabled = false,groups="smoke")
	public void deleteproduct()
	{
		Reporter.log("deleteproduct--Kids PRD sucessfully",true);
	}
    
	@Test(priority=2,dependsOnMethods = "addproduct",groups="functionality")
	public void updateproduct()
	{
		Reporter.log("Updateproduct--Kids PRD sucessfully",true);
	}
	
	@Test(priority=1,invocationCount = 2,groups="integration")
	public void addproduct()
	{
		//Assert.fail();
		Reporter.log("Addproduct--Kids PRD sucessfully",true);
	}
	


}
