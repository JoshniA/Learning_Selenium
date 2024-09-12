package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;

public class KidsProduct5Test extends BaseClass
{
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids PRD sucessfully",true);
	}
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids PRD sucessfully",true);
	}
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deleteproduct--Kids PRD sucessfully",true);
	}



}
