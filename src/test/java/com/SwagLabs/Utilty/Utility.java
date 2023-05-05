package com.SwagLabs.Utilty;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void captureScreenshot(WebDriver driver)
	{
	  try {
		FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./"+"\\ScreenShots\\screen"+System.currentTimeMillis()+".png"));
	} catch (WebDriverException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		  
	}
	
	public static WebElement waitForElementClickable(WebDriver driver,By loc)
	{
		 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		 return wait2.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	
	
	
	public static WebElement waitForElementVisible(WebDriver driver,By loc)
	{
		 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		 return wait2.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait2.until(ExpectedConditions.urlContains(url));
	}
	
	public static boolean waitForTitleMatch(WebDriver driver,String title)
	{
		 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		  return wait2.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	
	
	//JavaScript
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
	}
	
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
	
	
	//to maintain all generic method

	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		
		System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		
		List<WebElement> allOptions=dd.getOptions();
		
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
}
