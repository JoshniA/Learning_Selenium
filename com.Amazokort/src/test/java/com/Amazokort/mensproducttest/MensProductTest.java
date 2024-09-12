package com.Amazokort.mensproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;

public class MensProductTest extends BaseClass 
{
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addedproduct--Mens sucessfully",true);
	}
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("Updatedproduct--Mens sucessfully",true);
	}
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deletedproduct--Mens sucessfully",true);
	}

}
