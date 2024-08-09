package com.Amazokart.generic.common;

import com.Amazokort.generic.excelutility.ReadExcelFile;
import com.Amazokort.generic.javautility.JavaUtility;
import com.Amazokort.generic.propertyfileutility.ReadPropertyFile;
import com.Amazokort.generic.webdriverutility.WebdriverUtility;

public class ObjectUtility implements FrameworkConstant
{
	
		public ReadExcelFile excelobj;
		public JavaUtility javaojb;
		public ReadPropertyFile propertyobj;
		public WebdriverUtility webdriverobj;
		
		
	public void objectCreation()
	{
		 excelobj=new ReadExcelFile();
		 javaojb=new JavaUtility();
		 propertyobj=new ReadPropertyFile();
		 webdriverobj=new WebdriverUtility();
	}

}
