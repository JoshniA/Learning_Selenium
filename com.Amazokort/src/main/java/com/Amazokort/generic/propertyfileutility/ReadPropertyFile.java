package com.Amazokort.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amazokart.generic.common.FrameworkConstant;

public class ReadPropertyFile implements FrameworkConstant
{
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	
	public String readdata(String key) 
	{
		//Convert physical file into java understable
		try {
			fis=new FileInputStream(PropertyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//converting Instance for Properties class
		p=new Properties();
		
		//load all the common data
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
		
	}
	
	public void writeData(String key,String value) 
	{
		//enter the data
		p.put(key, value);
		//create instance for file output stream
		try {
			fos=new FileOutputStream(PropertyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    //Store the data
		try {
			p.store(fos,"updated the new key-value sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displaydata(String key)
	{
		//create instance for properties class
		p=new Properties();
		//fetch the data
		String data=p.getProperty(key);
		//print on console
		System.out.println(data);
	}

}
