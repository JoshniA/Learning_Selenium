package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest4 
{
	@Test(groups="integration")
	public void addproduct()
	{
		Reporter.log("Addproduct--Kids PRD sucessfully",true);
	}
	@Test(groups="functionality")
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
