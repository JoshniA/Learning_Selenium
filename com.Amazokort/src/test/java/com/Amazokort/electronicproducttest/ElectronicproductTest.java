package com.Amazokort.electronicproducttest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;
@Listeners(com.Amazokart.generic.listenerutility.Listeners.class)
public class ElectronicproductTest extends BaseClass
{
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addedproduct--Electronic sucessfully",true);
	}
	@Test(groups="It")
	public void updateproduct()
	{
		Reporter.log("Updatedproduct--Electronic sucessfully",true);
	}
	@Test(groups="ST")
	public void deleteproduct()
	{
		Reporter.log("deletedproduct--Electronic sucessfully",true);
	}


}
