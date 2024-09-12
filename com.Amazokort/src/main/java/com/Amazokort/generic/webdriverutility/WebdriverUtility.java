package com.Amazokort.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Amazokart.generic.common.FrameworkConstant;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class contains reusable methods to perform driver related operatios
 * @author Josh
 * */
public class WebdriverUtility implements FrameworkConstant
{
	public WebDriver driver;
	public static WebDriver static_driver;
	Actions action;
	Select select;
	/**
	 * This method launches specified browsert
	 * @param browser
	 * @param return*/
	public WebDriver launchBrowser(String browser)
	{
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser info");
			break;
		}
		return driver;
	}
	
	/**
	 * This is used to maximize the browser
	 * */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	/**
	 * This is used to navigate to application
	 * @param url
	 * */
	public void navigateToApp(String Url)
	{
		driver.get(Url);
	}
	
	/**
	 *This method waits until element is found
	 *@param time*/
	public void waitUntilElementFound()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitduration));
	}
	
	/**
	 * This method waits until element is visible on the WEb Page
	 * 
	 * @param time
	 * @param element
	 * @return
	 **/
    public void explicitWait(long time ,WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
    	 wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    /**
     * This method is used to mouse hover on an element
     * 
     * @param elememt
     */
    public void mouseHoverToElement(WebElement element)
    {
    	action=new Actions(driver);
    	action.moveToElement(element).perform();
    }
    
    /**
     *This method is used to double click  on an element
     *
     *@param element
     **/
    public void doubleClickOnElement(WebElement element)
    {
    	action=new Actions(driver);
    	action.doubleClick(element).perform();
    }
    
    /**
     *This method is used to right click  on an element
     *
     *@param element
     **/
    public void rightClick(WebElement element)
    {
    	action=new Actions(driver);
    	action.contextClick(element).perform();
    }
    
    /**
     *This method is used to rigtht click on the target  
     *
     *@param element
     *@param target
     **/
    public void dragAndDropElement(WebElement element, WebElement target)
    {
    	action=new Actions(driver);
    	action.dragAndDrop(element, target).perform();;
    }
    
    /**
     *This method is select an element from dropdown based on index  
     *
     *@param element
     *@param index
     **/
    public void selectFromDropDown(WebElement element, int index)
    {
    	select=new Select(element);
    	select.selectByIndex(index);
    }
    
    /**
     *This method is select an element from dropdown based on value  
     *
     *@param value
     *@param element
     **/
    public void selectFromDropdown(WebElement element,String value)
    {
    	select=new Select(element);
    	select.selectByValue(value);
    }
    
    /**
     *This method is select an element from dropdown based on visible text  
     *
     *@param text
     *@param element
     **/
    public void selectFromDropdown(String text,WebElement element)
    {
    	select=new Select(element);
    	select.selectByVisibleText(text);
    }
    
    /**
     *This methos is used to switch to frame based on idOrName attribute value
     *
     *@param idOrName
     **/
    public void switchToFrame(String idOrName)
    {
    	driver.switchTo().frame(idOrName);
    }
    
	/**
	 * THis method is use to switch to frame based on frame element
	 * @param element*/
    public void switchToFrame(WebElement element)
    {
    	driver.switchTo().frame(element);
    }
	

	/**
	 * THis method is use to switch back to default window
	 * @param element*/
    public void switchToDefaultWindow()
    {
    	driver.switchTo().defaultContent();
    }
    
    /**
	 * This method is used to scroll till the specified element on the web page
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	/**
	 * This method handles alert pop up
	 * 
	 * @param status
	 */
	public void handleAlert(String status) {
		Alert al = driver.switchTo().alert();
		if (status.equalsIgnoreCase("ok"))
			al.accept();
		else
			al.dismiss();
	}
	
	/**
	 * This method is used to close current tab or window
	 */
	public void closeWindow() {
		driver.close();
	}

	/**
	 * This method is used to close all the opened tabs or windows
	 */
	public void quitAllWindows() {
		driver.quit();
	}

	/**
	 * This method converts dynamic xpath to WebElement
	 * 
	 * @param commonPath
	 * @param replaceData
	 * @return
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData) {
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}



	
	
	
	
	
	
	
	

	//SWITCH TO ALERT HANDLING
	public void switchToAlertAndAccept(WebDriver driver) 
    {
		driver.switchTo().alert().accept();
	}
	public void switchToAlertAndCancel(WebDriver driver) 
    {
		driver.switchTo().alert().dismiss();;
	}
	//Select class handle the dropdowns
	public void select(WebElement element,String text) 
    {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void select(WebElement element,int index) 
    {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	
	//Actions class to handle the mouse &keyboard actions
	public void mousemoveonElement(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act= new Actions(driver);
		act.doubleClick(element).perform();
	}

    
	public void clickOnElement()
	{
		
	}
	public void passDataOnElement()
	{
		
	}
	public void clearDataOnElement()
	{
		
	}
	public void validateOnElementDisplayed()
	{
		
	}
	public void validateOnElementEnabled()
	{
		
	}
	public void validateOnElementSeleted()
	{
		
	}
	public void SelectOptionOnDropdown(int index)
	{
		
	}
	public void SelectOptionOnDropdown(String visibletext)
	{
		
	}
	public void SelectOptionOnDropdown_Value(String value)
	{
		
	}
	public void SwitchControlToAlert()
	{
		
	}
	public void SwitchControlToFrame()
	{
		
	}

}










