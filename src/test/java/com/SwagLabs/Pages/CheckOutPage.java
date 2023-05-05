package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	//action
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	
	
	public void doContinue(String fname,String lname,String zcode)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		driver.findElement(continuebtn).click();
		
	}
	
	
	
	
	
	

}
