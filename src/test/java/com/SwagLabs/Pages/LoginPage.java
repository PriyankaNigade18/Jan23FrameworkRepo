package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	//initialization of driver
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	//Encapsulation=private data+public method
	
	//Locator By locator 
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	//Actions
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		
		driver.findElement(loginbtn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

}
