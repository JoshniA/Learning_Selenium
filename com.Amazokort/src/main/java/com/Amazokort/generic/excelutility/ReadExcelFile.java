package com.Amazokort.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetBuilder;

import com.Amazokart.generic.common.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant
{
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	public String readdata(String sheet,int row,int column) 
	{
		try {
			fis=new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Create the workbook
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Using workbook go to Sheet, row,column and cell fetch the Data
		String data=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public void writedata(String sheet,int row,int column,String data) 
	{
		try {
			fis=new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Create the workbook
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Create a new column and write Dataon it.
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
		//convert java data into physical file
		try {
			fos=new FileOutputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//write the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void displaydata(String sheet,int row,int column) 
	{
		try {
			fis=new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Create the workbook
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Using workbook go to Sheet, row,column and cell fetch the Data
		String data=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		//print the data
		System.out.println(data);
	}
	
	public void displaymultipledata(String sheet,int column) 
	{
		try {
			fis=new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Create the workbook
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//usingworkbook go to sheet
        Sheet sht=wb.getSheet(sheet);
        int count=sht.getLastRowNum();
        for(int i=1;i<=count;i++)
        {
        	//optimize code
        	String data=wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
        	System.out.println(data);
        }
	}

}
