package saddlepoint;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo 
{
	public static void main(String[] args) throws Throwable, IOException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://dev.saddlepointtech.com");
		driver.manage().window().maximize();
		
	FileInputStream fis=new FileInputStream("./src/test/resources/data/login.xlsx");
	Workbook book=WorkbookFactory.create(fis);	
	DataFormatter df=new DataFormatter();
	
	String email=df.formatCellValue((Cell) book.getSheet("Sheet1").getRow(1).getCell(0));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
	String password=df.formatCellValue((Cell) book.getSheet("Sheet1").getRow(1).getCell(1));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("(//span[@class='z-toolbarbutton-content'])[1]/img")).click();
	driver.findElement(By.xpath("(//span[text()='Master Data'])[1]")).click();
		
	}
}
