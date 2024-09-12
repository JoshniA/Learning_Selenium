package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;

public class KidsProduct3Test extends BaseClass 
{
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids PRD 3 sucessfully",true);
	}
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids PRD 3 sucessfully",true);
	}
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deleteproduct--Kids PRD 3 sucessfully",true);
	}



}
