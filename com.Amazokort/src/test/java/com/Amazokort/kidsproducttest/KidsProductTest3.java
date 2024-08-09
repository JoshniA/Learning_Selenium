package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest3 
{
	@Test(enabled = false)
	public void addproduct()
	{
		Reporter.log("Addproduct--Kids PRD sucessfully",true);
	}
	@Test(invocationCount = 0,groups="integration")
	public void updateproduct()
	{
		Reporter.log("Updateproduct--Kids PRD sucessfully",true);
	}
	@Test(groups="smoke")
	public void deleteproduct()
	{
		Reporter.log("deleteproduct--Kids PRD sucessfully",true);
	}



}
