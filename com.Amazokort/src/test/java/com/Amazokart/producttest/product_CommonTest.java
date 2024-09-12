package com.Amazokart.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;

public class product_CommonTest extends BaseClass
{
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addedproduct--Common sucessfully",true);
	}
	@Test(groups="IT")
	public void updateProduct()
	{
		Reporter.log("Updatedproduct--Common sucessfully",true);
	}
	@Test(groups="ST")
	public void deleteProduct()
	{
		Reporter.log("deletedproduct--Common sucessfully",true);
	}




}
