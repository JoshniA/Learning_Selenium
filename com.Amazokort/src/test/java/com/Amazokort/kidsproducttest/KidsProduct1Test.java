package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;

public class KidsProduct1Test extends BaseClass
{
	@Test(priority=3,dependsOnMethods = "addProduct",groups="ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids PRD 1 sucessfully",true);
	}
    
	@Test(priority=2,dependsOnMethods = "addProduct",groups="IT")
	public void updateProduct()
	{
		Reporter.log("UpdateProduct--Kids PRD 1 sucessfully",true);
	}
	
	@Test(priority=1,groups="FT")
	public void addProduct()
	{
		//Assert.fail();
		Reporter.log("Addproduct--Kids PRD 1 sucessfully",true);
	}
	


}
