package com.Amazokort.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test
	public void login_ValidData() 
	{
		Reporter.log("login_validData sucessfully",true);
	}
	@Test
	public void login_inValidData() 
	{
		Reporter.log("login_invalidData sucessfully",true);
	}
}
